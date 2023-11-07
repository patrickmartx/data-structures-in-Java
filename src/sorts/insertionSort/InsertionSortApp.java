package sorts.insertionSort;

import utils.PrintFormatting;

public class InsertionSortApp {
    public static void main(String[] args) {
        PrintFormatting print = new PrintFormatting();
        int[] vector = new int[10_000];

        for(int i=0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        print.printInVector(vector);

        long initialTime = System.currentTimeMillis();
        // Insertion sort // O(N²)
        int aux;
        int j;
        for (int i=1; i < vector.length; i++) {
            aux = vector[i];
            j = i-1;
            while(j > 0 && vector[j] > aux) {
                vector[j+1] = vector[j];
                j--;
            }
            vector[j+1] = aux;
        }
        long finalTime = System.currentTimeMillis();
        long time = finalTime - initialTime;

        System.out.println("\nin order\n" );

        print.printInVector(vector);

        System.out.println("time taken to order :" + time + "ms");
        // 32ms
    }
}


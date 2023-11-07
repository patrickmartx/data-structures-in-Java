package sorts.selectionSort;

import utils.PrintFormatting;

public class SelectionSortApp {
    public static void main(String[] args) {
        PrintFormatting print = new PrintFormatting();

        int[] vector = new int[10_000];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        print.printInVector(vector);

        long initialTime = System.currentTimeMillis();

        // Selection sort // O(N²)

        int minorPosition;
        int aux;
        for (int i=0; i < vector.length; i++) {
            minorPosition = i;
            for (int j=i+1; j < vector.length; j++) {
                if (vector[j] < vector[minorPosition]) {
                    minorPosition = j;
                }
            }
            aux = vector[minorPosition];
            vector[minorPosition] = vector[i];
            vector[i] = aux;
        }

        long finalTime = System.currentTimeMillis();
        long time = finalTime - initialTime;

        System.out.println("\nin order\n" );

        print.printInVector(vector);

        System.out.println("time taken to order :" + time + "ms");
        // 62ms
    }
}

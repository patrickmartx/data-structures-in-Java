package sorts.quickSort;

import utils.PrintFormatting;

public class QuickSortApp {
    public static void main(String[] args) {
        PrintFormatting print = new PrintFormatting();
        int[] vector = new int[10_000];

        for(int i=0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        print.printInVector(vector);

        long initialTime = System.currentTimeMillis();
        // Quick Sort
        quickSort(vector, 0, vector.length-1);

        long finalTime = System.currentTimeMillis();
        long time = finalTime - initialTime;

        System.out.println("\nin order\n" );

        print.printInVector(vector);

        System.out.println("time taken to order :" + time + "ms");
        // 0ms
    }

    static void quickSort(int[] vector, int left, int right) {
        if (left < right) {
            int pivot = partition(vector, left, right);
            quickSort(vector, left, pivot);
            quickSort(vector, pivot + 1, right);
        }
    }

    static int partition(int[] vector, int left, int right) {
        int middle = (int) (left + right) / 2;
        int pivot = vector[middle];
        int i = left - 1;
        int j = right + 1;

        while (true) {
            do {
                i++;
            } while (vector[i] < pivot);
            do {
                j--;
            } while (vector[j] > pivot);
            if (i >= j) {
                return j;
            }
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
        }
    }

}

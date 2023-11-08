package sorts.heapSort;

import utils.PrintFormatting;

public class HeapSortApp {
    public static void main(String[] args) {
        PrintFormatting print = new PrintFormatting();
        int[] vector = new int[10_000];

        for(int i=0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        print.printInVector(vector);

        long initialTime = System.currentTimeMillis();
        // Heap Sort
        int vectorSize = vector.length;

        for (int i= vectorSize / 2 - 1; i >= 0; i--) {
            aplicateHeap(vector, vectorSize, i);
        }

        System.out.println("\nparcial order order\n" );
        print.printInVector(vector);

        for (int i = vectorSize-1; i > 0; i--) {
            int aux = vector[0];
            vector[0] = vector[i];
            vector[i] = aux;

            aplicateHeap(vector, i, 0);
        }

        long finalTime = System.currentTimeMillis();
        long time = finalTime - initialTime;

        System.out.println("\nin order\n" );

        print.printInVector(vector);

        System.out.println("time taken to order :" + time + "ms");
        // 38ms
    }
    private static void aplicateHeap(int[] vector, int vectorSize, int iterator) {
        int root = iterator;
        int left = 2*iterator + 1;
        int right = 2*iterator + 2;

        if (left < vectorSize && vector[left] > vector[root]) {
            root = left;
        }
        if (right < vectorSize && vector[right] > vector[root]) {
            root = right;
        }
        if (root != iterator) {
            int aux = vector[iterator];
            vector[iterator] = vector[root];
            vector[root] = aux;

            aplicateHeap(vector, vectorSize, root);
        }
    }
}

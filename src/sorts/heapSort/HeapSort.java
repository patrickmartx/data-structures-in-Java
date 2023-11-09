package sorts.heapSort;

import utils.Results;

public class HeapSort {

    static long changes = 0L;

    public static Results sort(int[] vector){
        //Heap Sort
        int vectorSize = vector.length;


        for(int i = vectorSize / 2 - 1; i >= 0; i--){
            aplicateHeap(vector, vectorSize, i);
        }

        for(int j = vectorSize-1; j > 0; j--){
            int aux = vector[0];
            vector[0] = vector[j];
            vector[j] = aux;
            changes++;

            aplicateHeap(vector, j, 0);
        }
        return new Results(vector, changes);
    }

    private static void aplicateHeap(int[] vetor, int vectorSize, int iterator){
        int root = iterator;
        int left = 2*iterator + 1;
        int right = 2*iterator + 2;

        if (left < vectorSize && vetor[left] > vetor[root]){
            root = left;
        }
        if (right < vectorSize && vetor[right] > vetor[root]){
            root = right;
        }

        if (root != iterator){
            int aux = vetor[iterator];
            vetor[iterator] = vetor[root];
            vetor[root] = aux;
            changes++;

            aplicateHeap(vetor, vectorSize, root);
        }
    }
}

package sorts.quickSort;

import utils.Results;

public class QuickSort {

    static long changes = 0L;

    public static Results sort(int[] vector, int left, int right){
        if (left < right){
            int pivot = partition(vector, left, right);
            sort(vector, left, pivot);
            sort(vector, pivot + 1, right);
        }
        return new Results(vector, changes);
    }

    private static int partition(int[] vector, int left, int right){
        int middle = (int) (left + right) / 2;
        int pivot = vector[middle];
        int i = left - 1;
        int j = right;
        while(true){
            do{
                i++;
            }while(vector[i] < pivot);
            do{
                j--;
            }while(vector[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux;
            changes++;
        }
    }
}

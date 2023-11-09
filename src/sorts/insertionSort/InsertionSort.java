package sorts.insertionSort;

import utils.Results;

public class InsertionSort {
    public static Results sort(int[] vector){
        Long changes = 0L;
        int aux;
        int j;
        for(int i=1; i < vector.length; i++){
            aux = vector[i];
            j = i-1;
            while(j >= 0 && vector[j] > aux){
                vector[j+1] = vector[j];
                j--;
                changes++;
            }
            vector[j+1] = aux;
            changes++;
        }
        return new Results(vector, changes);
    }
}

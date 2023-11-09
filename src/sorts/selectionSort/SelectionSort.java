package sorts.selectionSort;

import utils.Results;

public class SelectionSort {
    public static Results sort(int[] vector){
        long changes = 0L;
        //Selection sort O(N^2)
        int minorPosition;
        int aux;
        for(int i=0; i < vector.length; i++){ //O(N)
            minorPosition = i;
            for(int j = i+1; j < vector.length; j++){ //O(N)
                if (vector[j] < vector[minorPosition]){
                    minorPosition = j;
                }
            }
            aux = vector[minorPosition];
            vector[minorPosition] = vector[i];
            vector[i] = aux;
            changes++;
        }
        return new Results(vector, changes);
    }
}

package sorts.bubbleSort;

import utils.Results;

public class BubbleSort {
    public static Results sort(int[] vector){
        long changes = 0L;
        //BUBBLE SORT O(N^2)
        int aux;
        for(int i = 0; i < vector.length; i++){ // O(N)
            for(int j = i + 1; j < vector.length; j++){ //O(N)
                if (vector[i] > vector[j]){
                    aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                    changes++;
                }
            }
        }
        return new Results(vector, changes);
    }
}

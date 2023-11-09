package sorts.shellSort;

import utils.Results;

public class ShellSort {
    public static Results sort(int[] vector){
        long changes = 0L;
        /*
         *   h(s) = 1, for s = 1
         *   h(s) = 3.h.(s-1)+1, for s > 1
         */
        int h = 1;
        int vectorSize = vector.length;
        while(h < vectorSize){
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);

        int element;
        int j;
        while(h > 0){
            for(int i = h; i < vectorSize; i++){
                element = vector[i];
                j = i;
                while(j >= h && vector[j - h] > element){
                    vector[j] = vector[j - h];
                    j = j - h;
                    changes++;
                }
                vector[j] = element;
                changes++;
            }
            h = h / 2;
        }
        return new Results(vector, changes);
    }
}

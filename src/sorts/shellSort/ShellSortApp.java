package sorts.shellSort;

import utils.PrintFormatting;

public class ShellSortApp {
    public static void main(String[] args) {
        PrintFormatting pf = new PrintFormatting();
        int[] vector = new int[10_000];

        for (int i=0; i< vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        pf.printInVector(vector);

        long initialTime = System.currentTimeMillis();
        // Shell Sort
        /*
         *   h(s) = 1, for s = 1
         *   h(s) = 3.h.(s-1)+1, for s > 1
         */
        int h = 1;
        int vectorSize = vector.length;

        while(h < vectorSize) {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);

        int element;
        int j;
        while(h > 0) {
            for(int i = h; i < vectorSize; i++) {
                element = vector[i];
                j = i;
                while (j >= h && vector[j - h] > element) {
                    vector[j] = vector[j - h];
                    j = j - h;
                }
                vector[j] = element;
            }
            h = h / 2;
        }
        long finalTime = System.currentTimeMillis();
        long time = finalTime - initialTime;

        System.out.println("In order: ");
        pf.printInVector(vector);

        System.out.println("time taken to order :" + time + "ms");
        // 3ms
    }
}

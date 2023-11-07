package sorts.bubbleSort;

import java.util.Arrays;

public class BubbleSortApp {
    public static void main(String[] args) {
        int[] vector = new int[10_000];

        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }

        long initialTime = System.currentTimeMillis();
        // Bubble sort  / O(N²)
        int aux;
        for (int i = 0; i < vector.length; i++) { // O(n)
            for (int j = i+1; j < vector.length; j++) { // O(n-1)

                if (vector[i] > vector[j]) {
                    aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                }

            }
        }
        long finalTime = System.currentTimeMillis();
        long time = finalTime - initialTime;

        System.out.println("\nin order\n" );

        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("time taken to order :" + time + "ms");
        // 188ms
    }
}

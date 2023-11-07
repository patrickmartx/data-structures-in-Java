package structures.vector;

import java.util.Scanner;

public class BinarySearchVectorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[10_000];

        for(int i = 0; i < vector.length; i++) {
            vector[i] = i * 2;
//            System.out.println(vector[i]);
        }

        System.out.println("Which number do you want to search for?");
        int searchedNumber = 1;

        int count = 0;
        boolean exists = false;
        int initialValue = 0;
        int finalValue = vector.length - 1;
        int midValue;

        while (initialValue <= finalValue) {
            midValue = (int) ((initialValue + finalValue) / 2);
            count++;

            if (vector[midValue] == searchedNumber) {
                System.out.println("Exist in position: " + midValue);
                exists = true;
                break;
            }

            if (vector[midValue] < searchedNumber) {
                initialValue = midValue + 1;
            }

            if (vector[midValue] > searchedNumber) {
                finalValue = midValue - 1;
            }
        }

        if (!exists) {
            System.out.println("Doesn't exist");
        }
        System.out.println(count + " repeats");
    }
}

/*
O(log n)

| Vector lenght | repeats |
| 10            | 3       |
| 100           | 7       |
| 1_000         | 10      |
| 10_000        | 13      |
| 100_000       | 17      |
| 1_000_000     | 20      |
 */
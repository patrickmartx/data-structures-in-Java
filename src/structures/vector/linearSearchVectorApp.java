package structures.vector;

import java.util.Scanner;

public class linearSearchVectorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[8];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.println(vector[i]);
        }

        System.out.println("Which number do you want to search for?");
        int searchedNumber = input.nextInt();

        boolean exists = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == searchedNumber) {
                System.out.println("Exist in position: " + i);
                exists = true;
                break;
            }
        }
        if (!exists) {
            System.out.println("Doesn't exist");
        }

    }
}

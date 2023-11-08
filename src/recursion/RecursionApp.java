package recursion;

import utils.PrintFormatting;

public class RecursionApp {
    public static void main(String[] args) {
        PrintFormatting pf = new PrintFormatting();
        int[] vector = new int[10];

        for (int i=0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * vector.length);
        }

        pf.printInVector(vector);

        System.out.println();

        System.out.println(sum(0, 0, vector));
    }

    private static int sum(int sumResult, int position, int[] vector) {
        if (position < vector.length) {
            sumResult += vector[position];
            return sum(sumResult, position + 1, vector);
        }
        return sumResult;
    }
}

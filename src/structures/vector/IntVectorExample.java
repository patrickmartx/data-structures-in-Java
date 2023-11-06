package structures.vector;

import utils.PrintFormatting;

public class IntVectorExample {
    public static void main(String[] args) {
        PrintFormatting prettyPrint = new PrintFormatting();
        int[] intVector = new int[10];

        intVector[0] = 3;
        intVector[1] = 4;
        intVector[2] = 8;
        intVector[5] = 51;
        intVector[4] = 22;
        intVector[6] = 33;
        intVector[3] = 13;

        prettyPrint.printInVector(intVector);
    }
}

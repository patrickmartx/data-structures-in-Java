package structures.vector;

import utils.PrintFormatting;

import java.util.Scanner;

public class StringVectorExample {
    public static void main(String[] args) {
        PrintFormatting prettyPrint = new PrintFormatting();
        Scanner input = new Scanner(System.in);
        String[] brazilianStates = new String[10];

        brazilianStates[0] = "AC";
        brazilianStates[1] = "BA";
        brazilianStates[2] = "CE";
        brazilianStates[3] = "DF";
        brazilianStates[4] = "AM";
        brazilianStates[5] = "AP";
        brazilianStates[6] = "PB";
        brazilianStates[7] = "RN";
        brazilianStates[8] = "MS";
        brazilianStates[9] = "SP";

        prettyPrint.printInVector(brazilianStates);

        System.out.println("Which state abbreviation do you want to search?");
        String stateAbbreviationSearch = input.nextLine();

        // linear search
        boolean exist = false;
        for(int i = 0; i < brazilianStates.length; i++) {
            if(brazilianStates[i].equals(stateAbbreviationSearch)) {
                prettyPrint.printWithBars("exists in the vector at position " + i);
                exist = true;
            }
        }
        if (!exist) {
            prettyPrint.printWithBars("does not exist in the vector");
        }
    }
}

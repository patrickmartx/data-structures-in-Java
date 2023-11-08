package utils;

public class PrintFormatting {

    public PrintFormatting() {
    }

    public void printWithBars(String value) {
        System.out.println("-=-=-= print value =-=-=-");
        System.out.println(value);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void printWithBars(int value) {
        System.out.println("-=-=-= print value =-=-=-");
        System.out.println(value);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void printInVector(String[] values) {
        System.out.print("[ ");
        for (int i = 0; i < values.length; i++){
            System.out.print(values[i]);
            if (i != values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]\n");
    }

    public void printInVector(int[] values) {
        System.out.print("[ ");
        for (int i = 0; i < values.length; i++){
            System.out.print(values[i]);
            if (i != values.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]\n");
    }

}

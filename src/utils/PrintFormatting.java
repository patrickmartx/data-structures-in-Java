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
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }

    public void printInVector(int[] values) {
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }

}

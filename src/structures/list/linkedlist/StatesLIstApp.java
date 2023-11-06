package structures.list.linkedlist;

public class StatesLIstApp {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        System.out.println(list.getSizeOfList());

        list.add("AC");
        System.out.println(list.getSizeOfList());

        System.out.println("First item: " + list.getFirstItem().getValue());
        System.out.println("Last item : " + list.getLastItem().getValue());

        list.add("BA");
        System.out.println(list.getSizeOfList());

        System.out.println("First item: " + list.getFirstItem().getValue());
        System.out.println("Last item : " + list.getLastItem().getValue());

        list.add("CE");
        list.add("DF");

        System.out.println(list.getSizeOfList());
        System.out.println("First item: " + list.getFirstItem().getValue());
        System.out.println("Last item : " + list.getLastItem().getValue());

        for (int i = 0; i < list.getSizeOfList(); i++) {
            System.out.println(i + " - " + list.get(i).getValue());
        }

        System.out.println();

        // Remove state "CE"
        list.remove("CE");
        list.remove("BA");
        list.remove("DF");
        list.remove("AC");

        System.out.println("Removed!");
        for (int i = 0; i < list.getSizeOfList(); i++) {
            System.out.println(i + " - " + list.get(i).getValue());
        }
        System.out.println("List size: " + list.getSizeOfList());

        list.add("RJ");
        for (int i = 0; i < list.getSizeOfList(); i++) {
            System.out.println(i + " - " + list.get(i).getValue());
        }
        System.out.println("List size: " + list.getSizeOfList());
    }
}

package structures.list;

public class Program {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
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

        System.out.println(list.get(0).getValue());
        System.out.println(list.get(1).getValue());
        System.out.println(list.get(2).getValue());
        System.out.println(list.get(3).getValue());
    }
}

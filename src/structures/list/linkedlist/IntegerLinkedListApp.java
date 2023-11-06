package structures.list.linkedlist;

public class IntegerLinkedListApp {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(9);

        numbers.remove(3);

        for (int i = 0; i < numbers.getSizeOfList(); i++) {
            System.out.println(i + " - " + numbers.get(i).getValue());
        }
        System.out.println("List size: " + numbers.getSizeOfList());

    }
}

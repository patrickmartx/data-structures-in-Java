package structures.list.linkedlist;

public class ClientsListApp {
    public static void main(String[] args) {
        LinkedList<Client> clients = new LinkedList<Client>();

        clients.add(new Client("111.222.333-44", "Joao", 25));
        clients.add(new Client("444.333.222-11", "Pedro", 52));

        for (int i = 0; i < clients.getSizeOfList(); i++) {
            System.out.println(i + " - " + clients.get(i).getValue());
        }
        System.out.println("List size: " + clients.getSizeOfList());
    }
}

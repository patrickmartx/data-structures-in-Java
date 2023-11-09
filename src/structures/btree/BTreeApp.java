package structures.btree;

public class BTreeApp {
    public static void main(String[] args) {
        BTree<Integer> tree = new BTree<Integer>();

        tree.add(10);
        tree.add(8);
        tree.add(5);
        tree.add(9);
        tree.add(7);
        tree.add(18);
        tree.add(13);
        tree.add(20);
        System.out.println("In Order:");
        tree.printInOrder(tree.getRoot());
        System.out.println("\n\nPre Order:");

        tree.printPreOrder(tree.getRoot());

        System.out.println("\n\nPos Order:");
        tree.printPosOrder(tree.getRoot());

        tree.remove(10);
        tree.remove(8);
        tree.remove(5);
        tree.remove(9);
        tree.remove(7);
        tree.remove(18);
        tree.remove(13);
        tree.remove(20);

        System.out.println("\n\nRemoved:");
        tree.printInOrder(tree.getRoot());

    }
}

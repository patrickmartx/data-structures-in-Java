package comparison;

import structures.list.linkedlist.IteratorLinkedList;
import structures.list.linkedlist.LinkedList;

import java.util.ArrayList;
/*
Study bigO notation

Linear search: O(n)
n = size of list
 */
public class BetweenVectorAndLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> vector = new ArrayList<Integer>();

        //add elements
        int limit = 1_000_000;

        long initialTime = System.currentTimeMillis();

        for (int i = 0; i < limit; i++) {
            vector.add(i);
        }

        long finalTime = System.currentTimeMillis();

        System.out.println("add " + limit + " elements on vector");
        System.out.println(finalTime - initialTime);

        System.out.println();

        initialTime = System.currentTimeMillis();

        for (int i = 0; i < limit; i++) {
            linkedList.add(i);
        }

        finalTime = System.currentTimeMillis();

        System.out.println("add " + limit + " elements on linked list");
        System.out.println(finalTime - initialTime);

        System.out.println();

        //read values

        initialTime = System.currentTimeMillis();

        for (int i = 0; i < vector.size(); i++) {
            vector.get(i);
        }

        finalTime = System.currentTimeMillis();
        System.out.println("read " + limit + " elements on vector");
        System.out.println(finalTime - initialTime);

        System.out.println();

        initialTime = System.currentTimeMillis();

        IteratorLinkedList<Integer> iterator = linkedList.getIterator();
        while (iterator.haveNext()) {
            iterator.getNext();
        }

        finalTime = System.currentTimeMillis();
        System.out.println("read " + limit + " elements on linked list");
        System.out.println(finalTime - initialTime);

    }
}

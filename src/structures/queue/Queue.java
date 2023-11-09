package structures.queue;

import structures.list.linkedlist.LinkedList;

/*
QUEUE IS NOT A DATA STRUCTURE!!!
IT IS AN ABSTRACT DATA TYPE
 */
public class Queue<TYPE> {
    private LinkedList<TYPE> list;

    public Queue() {
        this.list = new LinkedList<TYPE>();
    }

    public void add(TYPE newValue) {
        this.list.add(newValue);
    }
    public void remove() {
        this.list.remove(this.get());
    }

    public TYPE get() {
        return this.list.getFirstItem().getValue();
    }

}

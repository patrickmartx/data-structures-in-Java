package structures.stack;

import structures.list.linkedlist.LinkedList;

public class Stack<TYPE> {
    private LinkedList<TYPE> list;

    public Stack() {
        this.list = new LinkedList<TYPE>();
    }

    public void add(TYPE newValue) {
        this.list.addInFirst(newValue);
    }
    public void remove() {
        this.list.remove(this.get());
    }

    public TYPE get() {
        return this.list.getFirstItem().getValue();
    }
}

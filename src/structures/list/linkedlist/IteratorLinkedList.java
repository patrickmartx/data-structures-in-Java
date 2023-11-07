package structures.list.linkedlist;

public class IteratorLinkedList<TYPE> {
    private Element<TYPE> element;

    public IteratorLinkedList(Element<TYPE> current) {
        this.element = current;
    }

    public boolean haveNext() {
        if (element.getNext() == null) {
            return false;
        }
        return true;
    }

    public Element<TYPE> getNext() {
        element = element.getNext();
        return element;
    }
}

package structures.list;

public class LinkedList {
    private Element firstItem;
    private Element lastItem;
    private int sizeOfList;

    public LinkedList() {
        this.sizeOfList = 0;
    }

    public Element getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(Element firstItem) {
        this.firstItem = firstItem;
    }

    public Element getLastItem() {
        return lastItem;
    }

    public void setLastItem(Element lastItem) {
        this.lastItem = lastItem;
    }

    public int getSizeOfList() {
        return sizeOfList;
    }

    public void setSizeOfList(int sizeOfList) {
        this.sizeOfList = sizeOfList;
    }

    public void add (String newValue) {
        Element newElement = new Element(newValue);

        if (this.firstItem == null && this.lastItem == null) {
            this.firstItem = this.lastItem = newElement;
        }else {
            this.lastItem.setNext(newElement);
            this.lastItem = newElement;
        }
        sizeOfList++;
    }

    public void remove (String value) {

    }

    public Element get (int position) {
        Element currentELement = this.firstItem;
        for (int i = 0; i < position; i++) {
            if (currentELement.getNext() != null) {
                currentELement = currentELement.getNext();
            }
        }
        return currentELement;
    }
}

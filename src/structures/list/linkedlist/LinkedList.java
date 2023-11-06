package structures.list.linkedlist;

public class LinkedList<TYPE> {
    private Element<TYPE> firstItem;
    private Element<TYPE> lastItem;
    private int sizeOfList;

    public LinkedList() {
        this.sizeOfList = 0;
    }

    public Element<TYPE> getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(Element<TYPE> firstItem) {
        this.firstItem = firstItem;
    }

    public Element<TYPE> getLastItem() {
        return lastItem;
    }

    public void setLastItem(Element<TYPE> lastItem) {
        this.lastItem = lastItem;
    }

    public int getSizeOfList() {
        return sizeOfList;
    }

    public void setSizeOfList(int sizeOfList) {
        this.sizeOfList = sizeOfList;
    }

    public void add (TYPE newValue) {
        Element<TYPE> newElement = new Element<TYPE>(newValue);

        if (this.firstItem == null && this.lastItem == null) {
            this.firstItem = this.lastItem = newElement;
        }else {
            this.lastItem.setNext(newElement);
            this.lastItem = newElement;
        }
        sizeOfList++;
    }

    public void remove (TYPE value) {
        Element<TYPE> previous = null;
        Element<TYPE> currentELement = this.firstItem;

        for (int i = 0; i < this.getSizeOfList(); i++) {
            if (currentELement.getValue().equals(value)) {
                if(this.sizeOfList == 1) {
                    this.firstItem = null;
                    this.lastItem = null;
                } else if(currentELement == firstItem) {
                    this.firstItem = currentELement.getNext();
                    currentELement.setNext(null);
                } else if (currentELement == lastItem) {
                    this.lastItem = previous;
                    previous.setNext(null);
                } else {
                    previous.setNext(currentELement.getNext());
                    currentELement = null;
                }
                this.sizeOfList--;
                break;
            }
            previous = currentELement;
            currentELement = currentELement.getNext();
        }
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

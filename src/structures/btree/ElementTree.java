package structures.btree;


public class ElementTree<TYPE> {
    private TYPE value;
    private ElementTree<TYPE> left;
    private ElementTree<TYPE> right;

    public ElementTree(TYPE newValue) {
        this.value = newValue;
        this.left = null;
        this.right = null;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }

    public ElementTree<TYPE> getLeft() {
        return left;
    }

    public void setLeft(ElementTree<TYPE> left) {
        this.left = left;
    }

    public ElementTree<TYPE> getRight() {
        return right;
    }

    public void setRight(ElementTree<TYPE> right) {
        this.right = right;
    }
}

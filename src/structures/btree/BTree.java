package structures.btree;

public class BTree<TYPE extends Comparable> {
    private ElementTree<TYPE> root;

    public BTree() {
        this.root = null;
    }

    public ElementTree<TYPE> getRoot() {
        return root;
    }

    public void setRoot(ElementTree<TYPE> root) {
        this.root = root;
    }

    public void add(TYPE value) {
        ElementTree<TYPE> newELement = new ElementTree<TYPE>(value);
        if (root == null) {
            this.root = newELement;
        } else {
            ElementTree<TYPE> current = this.root;
            while (true) {
                if (newELement.getValue().compareTo(current.getValue()) == -1) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newELement);
                        break;
                    }
                } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newELement);
                        break;
                    }
                }
            }
        }
    }

    public void printInOrder(ElementTree<TYPE> current) {
        if (current != null) {
            printInOrder(current.getLeft());
            System.out.print(current.getValue() + " ");
            printInOrder(current.getRight());
        }
    }

    public void printPreOrder(ElementTree<TYPE> current) {
        if (current != null) {
            System.out.print((current.getValue() + " "));
            printPreOrder(current.getLeft());
            printPreOrder(current.getRight());
        }
    }

    public void printPosOrder(ElementTree<TYPE> current) {
        if (current != null) {
            printPosOrder(current.getLeft());
            printPosOrder(current.getRight());
            System.out.print(current.getValue() + " ");
        }
    }

    public boolean remove(TYPE value) {
        ElementTree<TYPE> current = this.root;
        ElementTree<TYPE> currentFather = null;

        while (current != null) {
            if (current.getValue().equals(value)) {
                break;

            } else if (value.compareTo(current.getValue()) == -1) {
                currentFather = current;
                current = current.getLeft();
            } else {
                currentFather = current;
                current = current.getRight();
            }
        }
        if (current != null) {
            if (current.getRight() != null) {
                ElementTree<TYPE> substitute = current.getRight();
                ElementTree<TYPE> substituteFather = currentFather;
                while (substitute.getLeft() != null) {
                    substituteFather = substitute;
                    substitute = substitute.getLeft();
                }
                substitute.setLeft(current.getLeft());

                if (currentFather != null) {
                    if (current.getValue().compareTo(currentFather.getValue()) == -1) {
                        currentFather.setLeft(substitute);
                    } else {
                        currentFather.setRight(substitute);
                    }
                } else {
                    this.root = substitute;
                }

                if (substitute.getValue().compareTo(substituteFather.getValue()) == -1) {
                    substituteFather.setLeft(null);
                } else {
                    substituteFather.setRight(null);
                }

            } else if(current.getLeft() != null) {
                ElementTree<TYPE> substitute = current.getLeft();
                ElementTree<TYPE> substituteFather = currentFather;
                while (substitute.getRight() != null) {
                    substituteFather = substitute;
                    substitute = substitute.getRight();
                }

                if (current.getValue().compareTo(currentFather.getValue()) == -1) {
                    currentFather.setLeft(substitute);
                } else {
                    currentFather.setRight(substitute);
                }

                if (substitute.getValue().compareTo(substituteFather.getValue()) == -1) {
                    substituteFather.setLeft(null);
                } else {
                    substituteFather.setRight(null);
                }

            } else {
                if (currentFather != null) {
                    if (current.getValue().compareTo(currentFather.getValue()) == -1) {
                        currentFather.setLeft(null);
                    } else {
                        currentFather.setRight(null);
                    }
                } else {
                    this.root = null;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}

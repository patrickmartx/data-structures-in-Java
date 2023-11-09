package utils;

public class Results {
    private int[] vector;
    private long changes;

    public Results(int[] vector, Long changes) {
        this.vector = vector;
        this.changes = changes;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public long getChanges() {
        return changes;
    }

    public void setChanges(long changes) {
        this.changes = changes;
    }
}

package structures.forks;

public class Edge<TYPE> {
    private Double weight;
    private Vertex<TYPE> startData;
    private Vertex<TYPE> endData;

    public  Edge(Double weight, Vertex<TYPE> begin, Vertex<TYPE> end) {
        this.weight = weight;
        this.startData = begin;
        this.endData = end;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertex<TYPE> getStartData() {
        return startData;
    }

    public void setStartData(Vertex<TYPE> startData) {
        this.startData = startData;
    }

    public Vertex<TYPE> getEndData() {
        return endData;
    }

    public void setEndData(Vertex<TYPE> endData) {
        this.endData = endData;
    }
}

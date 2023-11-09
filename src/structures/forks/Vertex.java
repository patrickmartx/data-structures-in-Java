package structures.forks;

import java.util.ArrayList;

public class Vertex<TYPE> {
    private TYPE data;
    private ArrayList<Edge<TYPE>> edgeInput;
    private ArrayList<Edge<TYPE>> edgeOutput;

    public Vertex(TYPE data) {
        this.data = data;
        this.edgeInput = new ArrayList<Edge<TYPE>>();
        this.edgeOutput = new ArrayList<Edge<TYPE>>();
    }

    public TYPE getData() {
        return data;
    }

    public void setData(TYPE data) {
        this.data = data;
    }

    public void addEdgeInput(Edge<TYPE> edge) {
        this.edgeInput.add(edge);
    }

    public void addEdgeOutput(Edge<TYPE> edge) {
        this.edgeOutput.add(edge);
    }

    public ArrayList<Edge<TYPE>> getEdgeInput() {
        return edgeInput;
    }

    public void setEdgeInput(ArrayList<Edge<TYPE>> edgeInput) {
        this.edgeInput = edgeInput;
    }

    public ArrayList<Edge<TYPE>> getEdgeOutput() {
        return edgeOutput;
    }

    public void setEdgeOutput(ArrayList<Edge<TYPE>> edgeOutput) {
        this.edgeOutput = edgeOutput;
    }
}

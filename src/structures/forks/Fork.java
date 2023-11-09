package structures.forks;

import java.util.ArrayList;

public class Fork<TYPE> {
    private ArrayList<Vertex<TYPE>> vertexes;
    private ArrayList<Edge<TYPE>> edges;

    public Fork() {
        this.vertexes = new ArrayList<Vertex<TYPE>>();
        this.edges = new ArrayList<Edge<TYPE>>();
    }

    public void addVertex(TYPE data) {
        Vertex<TYPE> newVertex = new Vertex<TYPE>(data);
        this.vertexes.add(newVertex);
    }

    public void addEdge(Double weight, TYPE startData, TYPE endData) {
        Vertex<TYPE> start = this.getVertex(startData);
        Vertex<TYPE> end = this.getVertex(endData);

        Edge<TYPE> edge = new Edge<TYPE>(weight, start, end);
        start.addEdgeOutput(edge);
        end.addEdgeInput(edge);

        this.edges.add(edge);
    }

    public Vertex<TYPE> getVertex(TYPE data) {
        Vertex<TYPE> vertex = null;
        for (int i = 0; i < this.vertexes.size(); i++) {
            if (this.vertexes.get(i).getData().equals(data)) {
                vertex = this.vertexes.get(i);
                break;
            }
        }
        return vertex;
    }

    public void searchInWidth() {
        ArrayList<Vertex<TYPE>> marked = new ArrayList<Vertex<TYPE>>();
        ArrayList<Vertex<TYPE>> queue = new ArrayList<Vertex<TYPE>>();

        Vertex<TYPE> current = this.vertexes.get(0);
        marked.add(current);
        System.out.println(current.getData());

        queue.add(current);
        while (queue.size() > 0) {
            Vertex<TYPE> visitedOutputEdges = queue.get(0);
            for(int i = 0; i < visitedOutputEdges.getEdgeOutput().size(); i++) {
                Vertex<TYPE> next = visitedOutputEdges.getEdgeOutput().get(i).getEndData();
                if (!marked.contains(next)) {
                    marked.add(next);
                    System.out.println(next.getData());
                    queue.add(next);
                }
            }
            queue.remove(0);
        }

    }
}

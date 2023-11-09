package structures.forks;

public class ForkApp {
    public static void main(String[] args) {
        Fork<String> fork = new Fork<String>();
        fork.addVertex("Patrick");
        fork.addVertex("Giovanne");
        fork.addVertex("Beatriz");
        fork.addVertex("Thamires");

        fork.addEdge(10.0, "Patrick", "Beatriz");
        fork.addEdge(10.0, "Beatriz", "Patrick");
        fork.addEdge(10.0, "Giovanne", "Thamires");
        fork.addEdge(10.0, "Thamires", "Giovanne");
        fork.addEdge(8.0, "Patrick", "Giovanne");
        fork.addEdge(2.0, "Giovanne", "Beatriz");
        fork.addEdge(4.0, "Patrick", "Thamires");
        fork.addEdge(1.0, "Beatriz", "Thamires");

        fork.searchInWidth();
    }
}

import java.util.*;

class GraphNode {
    List<Integer> incoming = new ArrayList<>();
    List<Integer> outgoing = new ArrayList<>();
}

public class GraphEdges {

    static void addEdge(GraphNode[] graph, int source, int destination) {
        graph[source].outgoing.add(destination);
        graph[destination].incoming.add(source);
    }

    static void getIncomingNodes(GraphNode[] graph, int targetNode, List<Integer> incomingList) {
        incomingList.clear();
        incomingList.addAll(graph[targetNode].incoming);
    }

    static void printGraph(GraphNode[] graph, int totalNodes) {
        for (int node = 1; node <= totalNodes; node++) {
            System.out.print("Node " + node + " : Incoming : " + graph[node].incoming + "  Outgoing : " + graph[node].outgoing);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int totalNodes = 5;
        int[][] edgeList = {
            {1, 2},
            {2, 4},
            {5, 5},
            {5, 4},
            {3, 5},
            {2, 3},
            {3, 1}
        };

        GraphNode[] graph = new GraphNode[totalNodes + 1];
        for (int index = 0; index <= totalNodes; index++) {
            graph[index] = new GraphNode();
        }

        for (int[] edge : edgeList) {
            addEdge(graph, edge[0], edge[1]);
        }

        System.out.println("Graph structure:");
        printGraph(graph, totalNodes);

        List<Integer> incomingList = new ArrayList<>();
        getIncomingNodes(graph, 1, incomingList);

        System.out.println("\nFor node 1:");
        System.out.println("Incoming edges are from: " + incomingList);
    }
}
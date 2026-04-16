package module15;
import java.util.*;

class Pair {
    int node, weight;

    Pair(int n, int w) {
        node = n;
        weight = w;
    }
}

public class Prism {

    static int prims(int V, List<List<Pair>> adj) {

        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        pq.add(new Pair(0, 0));

        int sum = 0;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();
            int node = current.node;
            int weight = current.weight;

            if (visited[node]) continue;

            visited[node] = true;
            sum += weight;

            for (Pair neighbor : adj.get(node)) {
                if (!visited[neighbor.node]) {
                    pq.add(new Pair(neighbor.node, neighbor.weight));
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int V = 5;
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected graph
        adj.get(0).add(new Pair(1, 2));
        adj.get(1).add(new Pair(0, 2));

        adj.get(0).add(new Pair(3, 6));
        adj.get(3).add(new Pair(0, 6));

        adj.get(1).add(new Pair(2, 3));
        adj.get(2).add(new Pair(1, 3));

        adj.get(1).add(new Pair(3, 8));
        adj.get(3).add(new Pair(1, 8));

        adj.get(1).add(new Pair(4, 5));
        adj.get(4).add(new Pair(1, 5));

        adj.get(2).add(new Pair(4, 7));
        adj.get(4).add(new Pair(2, 7));

        int result = prims(V, adj);

        System.out.println("Minimum Spanning Tree Weight: " + result);
    }
}
package module14;

import java.util.*;

class CycleDetection {
    int V;
    List<List<Integer>> adj;

    CycleDetection(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    boolean dfs(int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            // If not visited → go deeper
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited)) {
                    return true;
                }
            }
            // If visited AND not parent → cycle
            else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }


    boolean hasCycle() {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetection g = new CycleDetection(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0); 
        g.addEdge(2, 3);

        System.out.println(g.hasCycle()); 
    }

}

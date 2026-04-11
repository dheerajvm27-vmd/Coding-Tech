package module14;

import java.util.*;

class Pair {
    int node, dist;

    Pair(int n, int d) {
        node = n;
        dist = d;
    }
}

public class Dijkstra {
    public static void main(String[] args) {

        int V = 4;
        List<List<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Pair(1, 4));
        graph.get(0).add(new Pair(2, 1));
        graph.get(2).add(new Pair(1, 2));
        graph.get(1).add(new Pair(3, 1));
        graph.get(2).add(new Pair(3, 5));

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        dist[0] = 0;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            for (Pair nei : graph.get(curr.node)) {

                if (curr.dist + nei.dist < dist[nei.node]) {
                    dist[nei.node] = curr.dist + nei.dist;
                    pq.add(new Pair(nei.node, dist[nei.node]));
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
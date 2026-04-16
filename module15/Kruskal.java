package module15;

import java.util.*;

class Edge {
    int u, v, weight;

    Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}

class DisjointSet {

    int[] parent;

    DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); 
        }
        return parent[x];
    }

    void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px != py) {
            parent[px] = py;
        }
    }
}

public class Kruskal {

    public static void main(String[] args) {

        int n = 5;
        char[] names = {'A', 'B', 'C', 'D', 'E'};

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 2)); 
        edges.add(new Edge(0, 3, 6)); 
        edges.add(new Edge(1, 2, 3)); 
        edges.add(new Edge(1, 3, 8)); 
        edges.add(new Edge(1, 4, 5)); 
        edges.add(new Edge(2, 4, 7)); 
        edges.add(new Edge(3, 4, 9)); 

        edges.sort((a, b) -> a.weight - b.weight);

        DisjointSet ds = new DisjointSet(n);

        int totalWeight = 0;

        System.out.println("MST Edges:");

        for (Edge e : edges) {
            if (ds.find(e.u) != ds.find(e.v)) {
                ds.union(e.u, e.v);
                totalWeight += e.weight;

                System.out.println(names[e.u] + " - " + names[e.v] + " : " + e.weight);
            }
        }

        System.out.println("Total MST Weight = " + totalWeight);
    }
}
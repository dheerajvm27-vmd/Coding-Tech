package module14;

import java.util.ArrayList;
import java.util.List;

public class Alist {

    int V;
    List<List<Integer>> adj;

    Alist(int v) {
        this.V = v;   // FIXED (was wrong)
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addedge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adj.get(i));
        }
    }

    public static void main(String[] args) {
        Alist ob = new Alist(4);

        ob.addedge(0, 1);
        ob.addedge(0, 2);
        ob.addedge(1, 3);

        ob.printGraph();
    }
}
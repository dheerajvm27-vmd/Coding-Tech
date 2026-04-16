package module15;

class DisjointSet {
    int[] parent;
    int[] rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return;

        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }
}

public class Disjoint{
    public static void main(String[] args) {

        int n = 5;
        DisjointSet ds = new DisjointSet(n);

        ds.union(0, 1);
        ds.union(1, 2);
        ds.union(3, 4);

        if (ds.find(0) == ds.find(2)) {
            System.out.println("0 and 2 are in the same set");
        } else {
            System.out.println("0 and 2 are in different sets");
        }

        if (ds.find(0) == ds.find(4)) {
            System.out.println("0 and 4 are in the same set");
        } else {
            System.out.println("0 and 4 are in different sets");
        }

        System.out.println("Parent array:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " -> " + ds.find(i));
        }
    }
}
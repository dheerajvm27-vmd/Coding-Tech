package module14;

import java.util.ArrayList;
import java.util.List;
public class graphs {
    public static void main(String[] args) {
        int V=3; 
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(2);
        graph.get(2).add(0);
        System.out.println(graph);

    }
}

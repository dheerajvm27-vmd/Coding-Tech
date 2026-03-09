package module9;
import java.util.*;
public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>(Arrays.asList(30, 10, 40, 20, 50));
        Set<Integer> linkedhashset = new LinkedHashSet<>(Arrays.asList(30, 10, 40, 20, 50));
        Set<Integer> treeset = new TreeSet<>(Arrays.asList(30, 10, 40, 20, 50));
        System.out.println("HashSet (Unordered Set): " + hashset);
        System.out.println("LinkedHashSet (Ordered Set): " + linkedhashset);
        System.out.println("TreeSet (Sorted Set): " + treeset);
    }
}

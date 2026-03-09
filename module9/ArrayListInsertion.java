package module9;
import java.util.ArrayList;
import java.util.List;
public class ArrayListInsertion {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        // adding at last
        al.add(10);
        al.add(20);
        // adding at beginning
        al.add(0, 5);
        // adding at specific position
        al.add(1, 50);
        System.out.println(al);
    }
}
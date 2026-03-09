package module9;
import java.util.LinkedList;
public class LinkedListInsertion {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        // add at last
        ll.add(10);
        ll.addLast(20);
        // add at beginning
        ll.addFirst(30);
        // add at specific index
        ll.add(2, 45);
        System.out.println(ll);
    }
}

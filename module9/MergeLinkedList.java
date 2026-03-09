package module9;
import java.util.Arrays;
import java.util.LinkedList;
public class MergeLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(6,7,8,9,10));
        System.out.println("LinkedList1: " + list1);
        System.out.println("LinkedList2: " + list2);
        // Merge both LinkedLists
        list1.addAll(list2);
        System.out.println("Merged LinkedList: " + list1);
    }
}
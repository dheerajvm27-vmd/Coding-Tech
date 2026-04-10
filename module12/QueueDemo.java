package module12;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Queue: " + q);
        System.out.println("Remove: " + q.poll());
        System.out.println("Front Element:"+q.peek());
        
        
    }
}
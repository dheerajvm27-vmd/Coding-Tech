package module12;
import java.util.Stack;
class QueueStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int x) {
        s1.push(x);
    }
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
public class StackToDeque {
    public static void main(String[] args) {
        QueueStack queue = new QueueStack();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Removed: " + queue.pop());
        System.out.println("Removed: " + queue.pop());
        System.out.println("Front element now: " + queue.peek());
    }
}

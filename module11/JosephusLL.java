package module11;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class JosephusLL{
    Node head = null;
    // Create circular linked list
    public void circularLL(int n){
        Node prev = null;
        for(int i = 1; i <= n; i++){
            Node newNode = new Node(i);
            if(head == null){
                head = newNode;
            }else{
                prev.next = newNode;
            }
            prev = newNode;
        }
        prev.next = head; // make circular
    }
    // Josephus logic
    public void josephus(int k){
        Node ptr = head;
        Node prev = null;
        while(ptr.next != ptr){
            for(int i = 1; i < k; i++){
                prev = ptr;
                ptr = ptr.next;
            }
            System.out.println("Eliminated: " + ptr.data);
            prev.next = ptr.next;
            ptr = ptr.next;
        }
        System.out.println("Winner: " + ptr.data);
    }
    public static void main(String[] args){
        JosephusLL list = new JosephusLL();
        int n = 7;
        int k = 3;
        list.circularLL(n);
        list.josephus(k);
    }
}

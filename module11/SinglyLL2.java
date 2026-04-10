package module11;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL2{
    Node head=null;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean detectCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;        // move 1 step
            fast=fast.next.next;   // move 2 steps
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        SinglyLL2 list=new SinglyLL2();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        // creating loop manually
        list.head.next.next.next.next=list.head.next;
        if(list.detectCycle())
            System.out.println("Loop Detected");
        else
            System.out.println("No Loop");
    }
}
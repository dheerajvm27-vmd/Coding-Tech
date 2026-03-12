package module10;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL1 {
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
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addAtPosition(int data,int position){
        if(position<1){
            System.out.println("Position out of range");
            return;
        }
        if(position==1){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        SinglyLL1 list=new SinglyLL1();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        list.addFirst(60);
        list.display();
        list.addAtPosition(25,4);
        list.display();
    }
}
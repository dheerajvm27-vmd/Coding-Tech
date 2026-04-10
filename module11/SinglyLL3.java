package module11;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL3{
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
    public void swapNodes(int x,int y){
        if(x==y) return;
        Node prevX=null,currX=head;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null,currY=head;
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }
        if(currX==null || currY==null){
            System.out.println("Nodes not found");
            return;
        }
        if(prevX!=null)
            prevX.next=currY;
        else
            head=currY;
        if(prevY!=null)
            prevY.next=currX;
        else
            head=currX;
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    public static void main(String[] args){
        SinglyLL3 list=new SinglyLL3();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println("Original List:");
        list.display();
        list.swapNodes(20,40);
        System.out.println("After Swapping:");
        list.display();
    }
}
       
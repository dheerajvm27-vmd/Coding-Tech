package module6;
public class Request {
    public static void main(String[] args) {
        Request r=new Request();
        r=null;
        System.gc();
        System.out.println("GC requested");
    }
}

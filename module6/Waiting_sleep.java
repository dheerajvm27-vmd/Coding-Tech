package module6;
class MyThread1 extends Thread {
   public void run() {
        try {
            System.out.println("Sleeping...");
            Thread.sleep(10000);   // 10 seconds
            System.out.println("Awake");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Waiting_sleep {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
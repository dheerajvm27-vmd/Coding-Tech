package module6;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Running");
    }
}
public class Newstate {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // New State
        System.out.println("State after creation: " + t1.getState());
        t1.start();   // Runnable State
        System.out.println("State after start(): " + t1.getState());
    }
}

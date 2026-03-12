package AssignmentWeek2;
class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}
public class MainThread {
     public static void main(String[] args) {
        // Thread using Thread class
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        // Thread using Runnable interface
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}

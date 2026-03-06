package module7;
class A {}
class B {}
public class Deadlock {
    static A objA = new A();
    static B objB = new B();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (objA) {
                System.out.println("Thread 1 locked objA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
                synchronized (objB) {
                    System.out.println("Thread 1 locked objB");
                }
            }
        });
            Thread t2 = new Thread(() -> {
            synchronized (objB) {
                System.out.println("Thread 2 locked objB");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
                synchronized (objA) {
                    System.out.println("Thread 2 locked objA");
                }
            }
        });
        t1.start();
        t2.start();
    }

    // Deadlock: occurs when two or more threads are waiting
    // for each other's resources, and none of them can proceed.

    // Example:
    // Thread 1 holds objA and waits for objB
    // Thread 2 holds objB and waits for objA

    // Since both threads are waiting for each other,
    // the program gets stuck forever (Deadlock).
}

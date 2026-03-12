package AssignmentWeek2;
class LifeCycle extends Thread {
    public void run() {
        System.out.println("Thread running");
        try {
            Thread.sleep(1000);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread finished");
    }
    public static void main(String[] args) {
        LifeCycle t = new LifeCycle();
        System.out.println("State: " + t.getState());
        t.start();
        System.out.println("State after start: " + t.getState());
    }
}
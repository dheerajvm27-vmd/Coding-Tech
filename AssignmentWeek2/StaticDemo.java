package AssignmentWeek2;
class StaticDemo {
    static int count = 0;
    StaticDemo() {
        count++;
    }
    static void display() {
        System.out.println("Total Objects: " + count);
    } 
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();
        StaticDemo.display();
    }
}

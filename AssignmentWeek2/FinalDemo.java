package AssignmentWeek2;
final class A {
    final int x = 10;
    final void show() {
        System.out.println("Final method example");
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        System.out.println(obj.x);
    }
}

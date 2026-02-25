package day3;
public class OverloadTest {
        int add(int a, int b) {
        System.out.println("Add Integer");
        return a + b;
    }
    double add(double a, double b) {
        System.out.println("Add Double");
        return a + b;
    }
    float add(float a, float b) {
        System.out.println("Add Float");
        return a + b;
    }
    public static void main(String[] args) {
        OverloadTest ov = new OverloadTest();
        System.out.println(ov.add(5, 10));
        System.out.println(ov.add(5.5f, 10.5f));
      }
}

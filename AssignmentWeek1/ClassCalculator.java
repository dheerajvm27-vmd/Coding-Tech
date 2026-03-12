package AssignmentWeek1;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class AdvancedCalculator extends Calculator {
    int add(int a, int b) {
        return a + b + 10;
    }
    public static void main(String[] args) {
        AdvancedCalculator obj = new AdvancedCalculator();
        System.out.println(obj.add(5, 5));
        System.out.println(obj.add(5, 5, 5));
    }
}

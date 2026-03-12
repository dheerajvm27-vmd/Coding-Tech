package module10;

public class RecursionStackDemo {
    static int factorial(int n) {
        System.out.println("Calling factorial(" + n + ")");
        if (n == 0 || n == 1) {
            System.out.println("Returning 1 from factorial(" + n + ")");
            return 1;
        }
        int result = n * factorial(n - 1);
        System.out.println("Returning " + result + " from factorial(" + n + ")");
        return result;
    }
    public static void main(String[] args) {
        int result = factorial(5);
    }
}

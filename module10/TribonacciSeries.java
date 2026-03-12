package module10;

public class TribonacciSeries {
     static int tribonacci(int n) {
        // Base case
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        // Recursive case
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Tribonacci Series upto " + terms + " terms");
        for (int i = 0; i < terms; i++) {
            System.out.print(tribonacci(i) + " ");
        }
    }
}
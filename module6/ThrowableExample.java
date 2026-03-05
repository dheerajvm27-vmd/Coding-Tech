package module6;
public class ThrowableExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 10;
            if (b == 0) {
                throw new Throwable("Division by Zero");
            }
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Throwable t) {
            System.out.println("Caught Throwable: " + t.getMessage());
        }
    }
}
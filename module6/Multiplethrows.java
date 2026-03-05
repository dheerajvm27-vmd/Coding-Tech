package module6;
public class Multiplethrows {
    static void checkValue(int num, String text)
            throws ArithmeticException, NullPointerException {
        if (num < 0) {
            throw new ArithmeticException("Number cannot be negative");
        }
        if (text == null) {
            throw new NullPointerException("Text cannot be null");
        }
        System.out.println("num: " + text);
    }
    public static void main(String[] args) {
        try {
            checkValue(-5, "null");
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointer: " + e.getMessage());
        }
        try {
            checkValue(-5, null);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally gets executed");
        }
    }
}
package module6;
public class ThrowInBlock {
    public static void main(String[] args) {
       try {
            try {
                System.out.println("Inside try block");
                throw new ArithmeticException("Exception from try");
            }
            catch (ArithmeticException e) {
                System.out.println("Caught in catch: " + e.getMessage());
                throw new NullPointerException("Exception from catch");
            }
            finally {
                System.out.println("Inside finally block");
                throw new RuntimeException("Exception from finally");
            }
 }
         catch (RuntimeException e) {
            System.out.println("Handled outside: " + e.getMessage());
        }
         System.out.println("Program completed");
    }
}
package AssignmentWeek2;
import java.io.*;
class ExceptionDemo {
    public static void main(String[] args) {
        // Unchecked Exception
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        // Checked Exception
        try {
            FileReader f = new FileReader("test.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
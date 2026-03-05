package module5;
public class CheckedUnchecked {
    public static void main(String[] args) {

        System.out.println("Checked Exceptions:");

        System.out.println("IOException");
        System.out.println("FileNotFoundException");
        System.out.println("SQLException");
        System.out.println("ClassNotFoundException");
        System.out.println("InterruptedException");
        System.out.println("InstantiationException");
        System.out.println("NoSuchMethodException");
        System.out.println("NoSuchFieldException");
        System.out.println("ParseException");

        System.out.println("\nUnchecked Exceptions (Runtime):");

        System.out.println("NullPointerException");
        System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println("StringIndexOutOfBoundsException");
        System.out.println("NumberFormatException");
        System.out.println("IllegalArgumentException");
        System.out.println("IllegalStateException");
        System.out.println("ClassCastException");
    }
}
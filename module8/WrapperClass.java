package module8;
public class WrapperClass {
    public static void main(String[] args) {
        // Autoboxing
        int a = 5;
        Integer intObj = a;
        System.out.println("Integer: " + intObj);
        // AutoUnboxing
        Integer b = 10;
        int c = b;
        System.out.println("Unboxed int: " + c);
        // Byte
        Byte byteObj = 10;
        System.out.println("Byte: " + byteObj);
        // Short
        Short shortObj = 20;
        System.out.println("Short: " + shortObj);
        // Long
        Long longObj = 1000L;
        System.out.println("Long: " + longObj);
        // Float
        Float floatObj = 5.5f;
        System.out.println("Float: " + floatObj);
        // Double
        Double doubleObj = 9.99;
        System.out.println("Double: " + doubleObj);
        // Character
        Character charObj = 'A';
        System.out.println("Character: " + charObj);
        // Boolean
        Boolean boolObj = true;
        System.out.println("Boolean: " + boolObj);
        // Wrapper class methods using Integer
        Integer num = 50;
        System.out.println("compareTo: " + num.compareTo(60));
        System.out.println("equals: " + num.equals(50));
        System.out.println("max: " + Integer.max(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("parseInt: " + Integer.parseInt("3000"));
        System.out.println("toString: " + num.toString());
    }
}
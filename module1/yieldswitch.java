import java.util.Scanner;
public class yieldswitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        ch = Character.toUpperCase(ch);

        String color = switch (ch) {
            case 'V' -> {
                yield "Violet";
            }
            case 'I' -> {
                yield "Indigo";
            }
            case 'B' -> {
                yield "Blue";
            }
            case 'G' -> {
                yield "Green";
            }
            default -> {
                yield "Invalid Input";
            }
        };

        System.out.println("Color is " + color);
    }
}
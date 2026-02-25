import java.util.Scanner;

public class vibgyor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        ch = Character.toUpperCase(ch);

        String color;

        switch(ch) {
            case 'V':
                color = "Violet";
                break;
            case 'I':
                color = "Indigo";
                break;
            case 'B':
                color = "Blue";
                break;
            case 'G':
                color = "Green";
                break;
            case 'Y':
                color = "Yellow";
                break;
            case 'O':
                color = "Orange";
                break;
            case 'R':
                color = "Red";
                break;
            default:
                color = "Invalid Input";
        }

        System.out.println("Color = " + color);
    }
}

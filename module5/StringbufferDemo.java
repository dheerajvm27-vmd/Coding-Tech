package module5;
import java.util.Scanner;
public class StringbufferDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);

        // append()
        sb.append(" Alien Force");
        System.out.println(sb);

        // insert()
        sb.insert(0, "XLR8 ");
        System.out.println(sb);

        // delete()
        sb.delete(3, 7);   // removes characters from index 3 to 6
        System.out.println(sb);

        // reverse()
        sb.reverse();
        System.out.println(sb);

        sc.close();
    }
}
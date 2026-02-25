package day2;
import java.util.Scanner;
public class SnakePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(num++ + "\t");
                }
            } else {
                int temp = num + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(temp-- + "\t");
                }
                num += n;
            }

            System.out.println();
        }
    }
}
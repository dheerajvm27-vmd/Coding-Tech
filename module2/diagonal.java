package day2;
import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int num = 1;

        for (int d = 0; d < 2 * n - 1; d++) {

            if (d % 2 == 0) {
                int row = (d < n) ? 0 : d - n + 1;
                int col = (d < n) ? d : n - 1;

                while (row < n && col >= 0) {
                    a[row][col] = num++;
                    row++;
                    col--;
                }
            } else {
                int col = (d < n) ? 0 : d - n + 1;
                int row = (d < n) ? d : n - 1;

                while (col < n && row >= 0) {
                    a[row][col] = num++;
                    row--;
                    col++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

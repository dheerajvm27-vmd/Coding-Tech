package day2;
import java.util.Scanner;
public class invzigzag {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r = 1; r <= 3; r++) 
            {
              for(int c = 1; c <= n; c++) {
                  if((r == 1 && c % 4 == 1) || (r == 2 && c % 2 == 0) || (r == 3 && c % 4 == 3)) 
                    {
                     System.out.print("* ");
                    }
                else {
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
}

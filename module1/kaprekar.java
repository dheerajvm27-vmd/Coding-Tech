import java.util.Scanner;

public class kaprekar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1) {
            System.out.println("Kaprekar");
        } else {
            int sq = n * n;
            int div = 10;
            boolean isKaprekar = false;

            while(div < sq) {
                int r = sq % div;   // right part
                int l = sq / div;   // left part

                if(r > 0 && (l + r) == n) {
                    isKaprekar = true;
                    break;
                }

                div *= 10;
            }

            if(isKaprekar) {
                System.out.println("Kaprekar");
            } else {
                System.out.println("Not Kaprekar");
            }
        }
    }
}

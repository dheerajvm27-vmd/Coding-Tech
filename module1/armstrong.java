import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int count = 0;

        while(n > 0) {
            count++;
            n = n / 10;
        }

        n = original;

        while(n > 0) {
            int d = n % 10;
            sum += (int)Math.pow(d, count);
            n = n / 10;
        }

        if(sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

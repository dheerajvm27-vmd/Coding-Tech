package AssignmentWeek1;
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}

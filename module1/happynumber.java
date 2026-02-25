import java.util.Scanner;
public class happynumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=1 && n!=4)
        {
            int sum=0;
            while(n>0)
            {
                int d=n%10;
                sum+=d*d;
                n/=10;
            }
            n=sum;
        }
        if(n==1)
        {
            System.out.println("Happy");
        }
        else
        {
            System.out.println("Not Happy");
        }
    }
}
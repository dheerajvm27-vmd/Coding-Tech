public class special {
    public static void main(String[] args) {
        int n =25;
        int sum=0;
        int pro =1;
        int first=n/10;
        int last=n%10;
        sum=first+last;
        pro=first*last;
        if(sum+pro==n)
        {
            System.out.println("Special");
        }
        else
        {
            System.out.println("Not Special");
        }
    }
    
}

package module5;
public class Stringpool {
    public static void main(String[] args) {
        String s1 = "Ben10";
        String s2 = "Ben10";
        String s3 = new String("Ben10");
        String s4 = new String("Ben10");

        System.out.println("s1==s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s3==s4 : " + (s3 == s4));
        System.out.println("s3.equals(s4) : " + s3.equals(s4));
        System.out.println("s1==s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        // intern() method
        String s5 = s3.intern();
        System.out.println("s1==s5 : " + (s1 == s5));
        System.out.println("s1.equals(s5) : " + s1.equals(s5));
    }
}
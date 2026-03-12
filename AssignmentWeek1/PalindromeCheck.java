package AssignmentWeek1;
public class PalindromeCheck {
    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return str.equals(rev);
    }
    public static void main(String[] args) {
        String word = "madam";
        if (isPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

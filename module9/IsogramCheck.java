package module9;
import java.util.*;
public class IsogramCheck {
    public static void main(String[] args) {
        String word = "Machine";
        word = word.toLowerCase();
        Set<Character> set = new HashSet<>();
        boolean isIsogram = true;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if (set.contains(c)) {
                    isIsogram = false;
                    break;
                }
                set.add(c);
            }
        }
        if (isIsogram) {
            System.out.println("Isogram");
        } else {
            System.out.println("Not an Isogram");
        }
    }
}

package module9;
import java.util.*;
public class Pangram {
    public static void main(String args[]){
        String str = "the quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            if(c >= 'a' && c <= 'z'){   // only alphabets
                set.add(c);
            }
        }
        if(set.size() == 26){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not a Pangram");
        }
    }
}
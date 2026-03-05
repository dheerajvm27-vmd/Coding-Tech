package module6;
// Custom Exception
class GC extends Exception {
    public GC(String message) {
        super(message);
    }
}
public class Librarydemo {
    static void checkAttedance(boolean absent) throws GC {
        if (absent) {
            throw new GC("Penalty to submit 3 books in library");
        } else {
            System.out.println("Present in class - No penalty");
        }
    }
    public static void main(String[] args) {
        try {
            checkAttedance(true);
        }
        catch (GC e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Welcome to Sapthagiri");
        }
    }
}
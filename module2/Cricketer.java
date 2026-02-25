package day2;
public class Cricketer {
   static {
        System.out.println("Thala for a reason");
    }

    static void player() {
        System.out.println("Virat Kohli");
    }

    public static void main(String[] args) {
        System.out.println("RCB");
        Cricketer ob = new Cricketer();
        ob.player();
    }
}
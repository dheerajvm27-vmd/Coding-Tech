package module4;
interface Human {
    void power();
    default void identity() {
        System.out.println("Gangadhar");
    }
}
class Shaktiman implements Human {
    @Override
    public void power() {
        System.out.println("Five elements");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
    Human h1 = new Shaktiman();
        h1.identity();
        h1.power();
    }
}
package module5;
class Final {
    final int x;
    Final(int x) {
        this.x = x;
    }
    void display() {
        System.out.println(x);
    }
}
public class Finalinitialization {
    public static void main(String[] args) {

        Final f = new Final(5);   // Correct way
        f.display();
    }
}

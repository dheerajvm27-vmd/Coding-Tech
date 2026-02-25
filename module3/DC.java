package day3;
class SuperHero {
    void fight() {
        System.out.println("SuperHeroes Save World");
    }
}
class Batman extends SuperHero {
    void identity() {
        System.out.println("Hello Bruce Wayne");
    }
}

class SuperMan extends SuperHero {
    void identity() {
        System.out.println("Henry Cavill");
    }
}
public class DC {
    public static void main(String[] args) {

        Batman b = new Batman();
        b.fight();
        b.identity();

        SuperMan s = new SuperMan();
        s.fight();
        s.identity();
    }
}
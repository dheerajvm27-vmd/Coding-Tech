package module4;
abstract class Hero {
    private String name;
    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract void power();
    public static void information() {
        System.out.println("DC SuperHeroes");
    }
}
class WonderWoman extends Hero {
    public WonderWoman(String name) {
        super(name);
    }
    @Override
    void power() {
        System.out.println(getName() + " has super strength and combat skills.");
    }
}
public class AbstractionDemo {

    public static void main(String[] args) {

        Hero.information();

        Hero hero1 = new WonderWoman("Gal Gadot");
        hero1.power();
    }
}
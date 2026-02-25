package day3;
class Car {
    void mode() {
        System.out.println("Race Car");
    }
}
class Formula1 extends Car {
    @Override
    void model() {
        System.out.println("Formula1 - Buddha Circuit New Delhi");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Car f = new Formula1();  
        f.mode();                
    }
}

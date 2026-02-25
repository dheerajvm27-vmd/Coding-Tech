package day3;

class Parent {
    void display() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("Child Class");
    }
}

public class Single {
    public static void main(String[] args) {

        Child c = new Child();
        c.display();
        c.displayChild();

        Parent p = new Parent();
        p.display();
    }
}
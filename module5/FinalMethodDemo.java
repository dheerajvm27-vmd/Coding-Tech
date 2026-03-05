package module5;

class Parent {
    final void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show1() { 
        System.out.println("Child class");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
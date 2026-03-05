package module6;

// Island Of Isolation
public class Test2 {
    Test2 ref;  // Instance variable
     public static void main(String[] args) {
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();

        t1.ref = t2;
        t2.ref = t1;

        t1 = null;
        t2 = null;
    }
}
package day3;

public class IIB{
    int runs;
    String Name;
    {
        System.out.println("Inside IIB");
        Name="Virat Kohli";
        runs=183;
    }
    IIB(){
        System.out.println("Inside Constructor");
       // runs=264;
       // Name="Rohit Sharma";
    }
    void display(){
        System.out.println(Name+" "+runs);
    }
    static{
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        IIB ob=new IIB();
        ob.display();
    }
}


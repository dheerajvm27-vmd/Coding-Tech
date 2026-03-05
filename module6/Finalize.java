package module6;
public class Finalize {
    protected void finalize(){
        System.out.println("Finalize called");
    }

    public static void main(String[] args) {
        Finalize f=new Finalize();
        f=null;
        System.gc();
    }
}
//Heap Structure in Generational GC
/* 
1.Young Generation
2.Old Generation
3.Metaspace
*/

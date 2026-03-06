package module7;
class A1{}
class B1{}
public class DeadlockFree {
    static A1 a=new A1();
    static B1 b=new B1();
    public static void main(String[] args){
        Thread t1=new Thread(()->{
                synchronized(a){
                    synchronized(b){
                        System.out.println("Thread 1 finished safely");
                    }
                    
                }
            });
            Thread t2=new Thread(()->{
                synchronized(b){
                    synchronized(a){
                        System.out.println("Thread 2 finished safely");
                    }
                }
             });
    t1.start();
    t2.start();
    }
    
}
package module9;
import java.util.ArrayList;
public class ArrayListNoGenerics {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Hi");
        list.add(3.14);
        list.add(true);
        System.out.println("List: " + list);
        for(int i = 0; i < list.size(); i++){
            Object num=(Object) list.get(i);
            System.out.println("Number: " + num);
        }
    }
}
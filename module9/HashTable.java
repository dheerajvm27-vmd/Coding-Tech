package module9;
public class HashTable {
    static int tableSize = 10;
    static int hashTable[] = new int[tableSize];
    static void insert(int key){
        int index = key % tableSize;
        hashTable[index] = key;
    }
    static void display(){
        for(int i = 0; i < tableSize; i++){
            System.out.println(i + " -> " + hashTable[i]);
        }
    }
    public static void main(String[] args) {
        insert(32);
        insert(33);
        insert(45);
        insert(56);
        insert(77);
        insert(90);
        display();
    }
}
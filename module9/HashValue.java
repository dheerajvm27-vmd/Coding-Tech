package module9;
public class HashValue {
    public static void main(String[] args) {
        int key = 25;
        int tableSize = 10;
        int hashValue = key % tableSize;
        System.out.println("Key -> " + key + " HashValue(Index) -> " + hashValue);
    }
}
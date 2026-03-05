package module6;
import java.io.*;
public class MultilevelDucking {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
        System.out.println("File opened successfully");
    }
    static void processFile() throws IOException {
        readFile();
    }
    static void handleFile() throws IOException {
        processFile();
    }
    public static void main(String[] args) {
        try {
            handleFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
        finally {
            System.out.println("Program executed");
        }
    }
}
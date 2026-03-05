package module6;
import java.util.Scanner;
public class Arrayindex {
  public static void fetchElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException(
                "Index " + index + " is out of bounds for array of length " + arr.length
            );
        } else {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to fetch: ");
        int index = sc.nextInt();
        try {
            fetchElement(arr, index);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        sc.close();
    }
}
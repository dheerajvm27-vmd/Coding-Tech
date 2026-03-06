package module7;
import java.util.Arrays;
import java.util.Scanner;
public class RotateByD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter D (Rotation)");
        int d = sc.nextInt();
        d = d % n; // Normalizing the step
        int[] rotated = new int[n];
        for(int i = 0; i < n; i++){
            rotated[(i + d) % n] = arr[i];
        }
        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(rotated));
        sc.close();
    }
}
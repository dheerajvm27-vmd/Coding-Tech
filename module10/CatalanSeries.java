package module10;

public class CatalanSeries {
    static int catalan(int n) {
        // Base Case
        if (n == 0 || n == 1)
            return 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += catalan(i) * catalan(n - 1 - i);
        }
        return result;
    }
    public static void main(String[] args) {
        int terms = 10;
        System.out.println("Catalan Number Series");
        for (int i = 0; i < terms; i++) {
            System.out.println(catalan(i) + " ");
        }
    }
}
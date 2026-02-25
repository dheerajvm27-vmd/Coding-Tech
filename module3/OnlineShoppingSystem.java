package day3; 
public class OnlineShoppingSystem {
static class Product {
        String productName;
        double price;
        static {
            System.out.println("Product class loaded");
        }
       {
            System.out.println("Product object created");
        }
        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            System.out.println("Product Constructor Executed");
        }
        double calculateDiscount() {
            return price;
        }
    }
    static class Electronics extends Product {
        int warrantyYears;
        Electronics(String productName, double price, int warrantyYears) {
            super(productName, price);
            this.warrantyYears = warrantyYears;
            System.out.println("Electronics Constructor Executed");
        }
        @Override
        double calculateDiscount() {
            return price * 0.9;
        }
    }
    public static void main(String[] args) {
          Product p = new Electronics("iPhone", 80000, 2);
          double finalPrice = p.calculateDiscount();
          System.out.println("Final Discounted Price: " + finalPrice);
    }
}
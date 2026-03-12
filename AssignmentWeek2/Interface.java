package AssignmentWeek2;
interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        p1.pay(500);
        p2.pay(300);
    }
}
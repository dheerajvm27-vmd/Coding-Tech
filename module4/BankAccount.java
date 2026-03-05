package module4;
public class BankAccount {
    private String accNo;
    private double balance;
    private int pin;
    private int wrongAttempt;
    private boolean locked;
    public BankAccount(String accNo, int pin, double balance) {
        this.accNo = accNo;
        this.pin = pin;
        this.balance = balance;
        this.wrongAttempt = 0;
        this.locked = false;
    }
    public void deposit(double amount) {
        if (!locked && amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit failed");
        }
    }
    public void withdraw(double amount, int enteredPin) {
        if (locked) {
            System.out.println("Account is locked");
            return;
        }
            if (enteredPin != pin) {
            wrongAttempt++;
            System.out.println("Wrong PIN");
            if (wrongAttempt >= 3) {
                locked = true;
                System.out.println("Account Locked");
            }
            return;
        }
        wrongAttempt = 0;
        if (amount > 0 && amount <= 25000 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed");
        }
    }
    public double getBalance(int enteredPin) {
        if (!locked && enteredPin == pin) {
            return balance;
        }
        System.out.println("Access denied");
        return -1;
    }
    public boolean isAccountLocked() {
        return locked;
    }
    public static void main(String[] args) {
    BankAccount acc = new BankAccount("123456789", 1234, 50000);
        acc.deposit(5000);
        acc.withdraw(10000, 1234);
        acc.withdraw(30000, 1234);
        acc.withdraw(30000, 1234);
        acc.withdraw(30000, 1234);
        System.out.println("Balance: " + acc.getBalance(1234));
        System.out.println("Is Locked: " + acc.isAccountLocked());
    }
}
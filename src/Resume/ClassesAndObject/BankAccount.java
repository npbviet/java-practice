package Resume.ClassesAndObject;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount ben = new BankAccount("Benson", -17.5);
        System.out.println(ben);
    }

    public String toString() {
        if (balance < 0) {
            return String.format("%s, -$%.2f", name, Math.abs(balance));
        } else if (balance == 0) {
            return String.format("%s, $%.2f", name, Math.abs(balance));
        }
        else {
            return name + ", $" + balance;
        }
    }
}
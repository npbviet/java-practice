package Day9_1.ClassesAndObjects;

public class BankAccount2 {
    private String id;
    private double balance;
    private int transactions;

    public BankAccount2(String id) {
        this.id = id;
        this.balance = 0.0;
        this.transactions = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public String getTransactions() {
        return String.valueOf(transactions);
    }

    public void deposit(double amount) {
        if (amount >= 0 && amount <= 500) {
            balance += amount;
            transactions++;
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && balance >= amount) {
            balance -= amount;
            transactions++;
        }
    }

    public static void main(String[] args) {
        BankAccount2 savings = new BankAccount2("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);

        savings.transactionFee(15.00);
        System.out.println(savings.getBalance());
    }

    public boolean transactionFee(double fee) {
        double totalFee = 0.0;

        for (int i = 1; i <= transactions; i++) {
            totalFee += i * fee;
        }

        if (balance > totalFee) {
            balance -= totalFee;
            return true;
        } else {
            balance = 0.0;
            return false;
        }
    }
}
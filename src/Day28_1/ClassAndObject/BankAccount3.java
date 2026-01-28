package Day28_1.ClassAndObject;

public class BankAccount3 {
    private String id = "";
    private String name = "";
    private double balance = 0.00;
    private boolean allowNegativeBalance = false;
    private int transactions = 0;
    private String transactionText = "";

    public BankAccount3() {}

    public BankAccount3(String id) {
        this.id = id;
        this.name = id;
    }

    public BankAccount3(String id, double balance) {
        this.id = id;
        this.name = id;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTransactionCount() {
        return transactions;
    }

    public String getTransactions() {
        return transactionText;
    }

    public void deposit(double amount) {
        if (0 <= amount) {
            balance += amount;
            transactionText += "deposit of $" + amount + "\n";
        }
        transactions++;
    }

    public void setAllowNegativeBalance(boolean allowNegativeBalance) {
        this.allowNegativeBalance = allowNegativeBalance;
    }

    public void setBalance(double balance) {
        if (balance >= 0 || allowNegativeBalance) {
            this.balance = balance;
        }
    }

    public void withdraw(double amount) {
        if (allowNegativeBalance || balance >= amount) {
            balance -= amount;
            transactionText += "withdrawal of $" + amount + "\n";
        }
        transactions++;
    }

    @Override
    public String toString() {
        return id;
    }

    public void transfer(BankAccount3 other, double amount) {
        if (amount <= 0 || this.balance <= 5.00) {
            return;
        }

        double actualTransferAmount;
        double availableToTransfer = this.balance - 5.00;

        if (amount > availableToTransfer) {
            actualTransferAmount = availableToTransfer;
        } else {
            actualTransferAmount = amount;
        }

        this.balance -= (actualTransferAmount + 5.00);
        this.transactions++;

        other.balance += actualTransferAmount;
        other.transactions++;
        System.out.print(this.id + ": " + this.balance + " ");
        System.out.println(other + ": " + amount);
    }

    public static void main (String[] args){
        BankAccount3 ben = new BankAccount3("Benson");
        ben.deposit(90.00);
        BankAccount3 mar = new BankAccount3("Marty");
        mar.deposit(25.00);

        ben.transfer(mar, 20.00);     // ben $65, mar $45   (ben loses $25, mar gains $20)
        ben.transfer(mar, 10.00);     // ben $50, mar $55   (ben loses $15, mar gains $10)
        ben.transfer(mar, -1);        // ben $50, mar $55   (no effect; negative amount)
        mar.transfer(ben, 39.00);     // ben $89, mar $11   (mar loses $44, ben gains $39)
        mar.transfer(ben, 50.00);     // ben $95, mar $ 0   (mar loses $11, ben gains $ 6)
        mar.transfer(ben,  1.00);     // ben $95, mar $ 0   (no effect; no money in account)
        ben.transfer(mar, 88.00);     // ben $ 2, mar $88   (ben loses $93, mar gains $88)
        ben.transfer(mar,  1.00);     // ben $ 2, mar $88   (no effect; can't afford fee)
    }
}

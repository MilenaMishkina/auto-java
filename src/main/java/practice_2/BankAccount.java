package practice_2;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String ownerValue, double balanceValue) {
        owner = ownerValue;
        balance = balanceValue;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String newOwner) {
        owner = newOwner;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount newBankAc = new BankAccount("Milena Mishkina", 1000.0);
        newBankAc.printBalance();
        newBankAc.deposit(2000.0);
        newBankAc.printBalance();
        newBankAc.withdraw(500.00);
        newBankAc.printBalance();
    }
}

// Abstract class representing a general Bank Account
public abstract class BankAccount {
    protected String accountNumber;  // Account number for identification
    protected double balance;       // Current balance of the account

    // Constructor to initialize the account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method to retrieve the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method to retrieve the account balance
    public double getBalance() {
        return balance;
    }

    // Abstract method for deposit operation, to be implemented in subclasses
    public abstract void deposit(double amount);

    // Abstract method for withdrawal operation, to be implemented in subclasses
    public abstract void withdraw(double amount);
}


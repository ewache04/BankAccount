// CheckingAccount class extends BankAccount, representing a checking account
public class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -500.00; // Overdraft limit for checking accounts

    // Constructor to initialize the checking account with account number and balance
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // Call to parent class constructor
    }

    // Deposit method for checking account: Adds money to the balance
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Increase balance by the deposit amount
            System.out.println("Deposited " + amount + " in Checking Account. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method for checking account: Deducts money from the balance with overdraft check
    @Override
    public void withdraw(double amount) {
        // Ensure the withdrawal doesn't exceed the overdraft limit
        if (amount > 0 && (balance - amount) >= OVERDRAFT_LIMIT) {
            balance -= amount;  // Deduct amount from the balance
            System.out.println("Withdrew " + amount + " from Checking Account. New balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount.");
        }
    }
}
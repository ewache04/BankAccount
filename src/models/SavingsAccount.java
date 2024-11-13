package models;

// models.SavingsAccount class extends models.BankAccount, representing a savings account
public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.01; // Interest rate applied on deposits
    private int withdrawalCount = 0;                  // Tracks the number of withdrawals made in a month
    private static final int MAX_WITHDRAWALS = 3;     // Maximum withdrawals allowed per month

    // Constructor to initialize the savings account with account number and balance
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // Call to parent class constructor
    }

    // Deposit method for savings account: Adds money to balance and applies interest
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Increase balance by deposit amount
            balance += balance * INTEREST_RATE;  // Apply interest on the new balance
            System.out.println("Deposited " + amount + " with interest in Savings Account. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method for savings account: Deducts money with a limit on the number of withdrawals
    @Override
    public void withdraw(double amount) {
        if (withdrawalCount < MAX_WITHDRAWALS) {  // Check if withdrawal limit is reached
            if (amount > 0 && amount <= balance) {  // Ensure withdrawal amount is valid
                balance -= amount;  // Deduct amount from balance
                withdrawalCount++;  // Increment the withdrawal count
                System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance or invalid withdrawal amount.");
            }
        } else {
            System.out.println("Withdrawal limit reached for the month.");
        }
    }
}
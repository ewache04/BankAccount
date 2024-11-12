// Main class to test the functionality of different bank accounts
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List to hold various bank account types
        List<BankAccount> accounts = new ArrayList<>();

        // Create and add a SavingsAccount and CheckingAccount to the list
        accounts.add(new SavingsAccount("SA123", 1000.0));
        accounts.add(new CheckingAccount("CA123", 500.0));

        // Iterate over each account, perform deposits and withdrawals, and print the results
        for (BankAccount account : accounts) {
            account.deposit(200.0);   // Deposit operation
            account.withdraw(150.0);  // Withdrawal operation
            account.withdraw(300.0);  // Another withdrawal to test limits
            // Print the final balance of each account
            System.out.println("Final balance for account " + account.getAccountNumber() + ": " + account.getBalance());
        }
    }
}
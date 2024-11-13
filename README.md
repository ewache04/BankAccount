```
# Bank Account System

A Java-based banking system demonstrating inheritance and polymorphism with `CheckingAccount` and `SavingsAccount` types.

## Features

- **Bank Account System**: Models basic account operations like balance management, deposit, and withdrawal.
- **Checking Account**: Supports overdrafts with a defined limit.
- **Savings Account**: Applies interest on deposits and limits withdrawals.
- **Polymorphism**: Uses abstract classes and method overriding for different account types.

## Folder Structure

```
├── BankAccount.java       # Abstract base class
├── CheckingAccount.java   # Checking account with overdraft
├── SavingsAccount.java    # Savings account with interest & withdrawal limits
├── Main.java              # Test class
└── README.md              # Project documentation
```

## Classes

### `BankAccount.java`
Base class for all accounts with common attributes (`accountNumber`, `balance`) and abstract methods (`deposit()`, `withdraw()`).

### `CheckingAccount.java`
Implements an overdraft feature, allowing withdrawals up to a defined limit.

### `SavingsAccount.java`
Applies interest on deposits and enforces a limit on the number of monthly withdrawals.

### `Main.java`
Demonstrates account operations by creating instances of `BankAccount`, `CheckingAccount`, and `SavingsAccount`.

## How to Run

### Prerequisites
- Java 8 or higher.

### Steps
1. Clone or download the repository.
2. Open the project in an IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run `Main.java`.

```bash
javac BankAccount.java CheckingAccount.java SavingsAccount.java Main.java
java Main
```

### Expected Output

Example output after performing deposit and withdrawal operations:

```
Deposited 200.0 in Savings Account. New balance: 1202.0
Withdrew 150.0 from Savings Account. New balance: 1052.0
Withdrew 300.0 from Savings Account. New balance: 752.0
Final balance for account SA123: 752.0

Deposited 200.0 in Checking Account. New balance: 700.0
Withdrew 150.0 from Checking Account. New balance: 550.0
Withdrew 300.0 from Checking Account. New balance: 250.0
Final balance for account CA123: 250.0
```

## Future Improvements

- **Transaction History**: Track and display transaction history.
- **User Input**: Enable user input for creating accounts and performing transactions.
- **More Account Types**: Add account types like `BusinessAccount`.

## License

Open-source project available under the [MIT License](LICENSE).
```
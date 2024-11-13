
---

# Source Code Documentation

## Overview

This directory contains the source code for the Bank Account Management System. The project includes an abstract class and its subclasses to model various types of bank accounts, demonstrating principles of object-oriented programming such as inheritance, encapsulation, and abstraction.

## Table of Contents

1. [Classes](#classes)
    - [BankAccount](#bankaccount)
    - [CheckingAccount](#checkingaccount)
    - [SavingsAccount](#savingsaccount)
    - [Main](#main)
2. [Design and Architecture](#design-and-architecture)
3. [Getting Started](#getting-started)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)

## Classes

### BankAccount

- **Location**: `models/BankAccount.java`
- **Description**: This is an abstract base class representing a generic bank account. It defines common attributes and methods for all bank accounts, such as balance management and transaction handling.
- **Key Methods**:
    - `deposit(double amount)`: Adds funds to the account.
    - `withdraw(double amount)`: Abstract method to be implemented by subclasses.
    - `getBalance()`: Returns the current balance.

### CheckingAccount

- **Location**: `models/CheckingAccount.java`
- **Description**: This class extends `BankAccount` and provides specific behavior for a checking account, including overdraft capabilities.
- **Key Features**:
    - Supports overdrafts up to a specified limit.
    - Implements the `withdraw` method.

### SavingsAccount

- **Location**: `models/SavingsAccount.java`
- **Description**: This class extends `BankAccount` and models a savings account with interest accumulation and withdrawal limits.
- **Key Features**:
    - Interest accumulation.
    - Limited withdrawals per month.

### Main

- **Location**: `Main.java`
- **Description**: Entry point for the application, which contains sample usage and testing of the `BankAccount` system.
- **Key Features**:
    - Demonstrates functionality for creating and managing various types of accounts.

## Design and Architecture

The source code is organized following object-oriented principles. Each core component of the system (e.g., `BankAccount`, `CheckingAccount`, `SavingsAccount`) is encapsulated within its respective class. The abstract base class defines shared attributes and behavior, while subclasses extend and implement specific functionality.

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the `src/` directory:
   ```
   cd src/
   ```
3. Compile the source files:
   ```
   javac Main.java
   ```
4. Run the application:
   ```
   java Main
   ```

## Usage

The system allows for basic operations with checking and savings accounts. The `Main` class contains sample scenarios to showcase how to:
- Create accounts.
- Deposit and withdraw funds.
- Handle specific account behavior like overdrafts (for `CheckingAccount`) and interest calculation (for `SavingsAccount`).

Feel free to modify and extend the codebase for custom functionality or additional account types.

## Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch-name`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch-name`).
5. Open a pull request.

## License

This project is licensed under the terms of the [LICENSE](../LICENSE) file in the root directory.

---

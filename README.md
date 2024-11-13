
---

# Bank Account Project

Welcome to the Bank Account project repository! This project provides an implementation of a banking system that includes multiple account types, such as checking and savings accounts, with basic operations and features.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Folder Structure](#folder-structure)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Design Documentation](#design-documentation)
- [Screenshots](#screenshots)
- [License](#license)

## Project Overview

The Bank Account project demonstrates an implementation of a basic banking system using Object-Oriented Programming (OOP) principles in Java. It includes:
- **BankAccount**: An abstract base class defining core functionalities for all accounts.
- **CheckingAccount**: A concrete class representing a checking account, with overdraft capabilities.
- **SavingsAccount**: A concrete class representing a savings account, featuring interest and withdrawal limits.

The purpose of this project is to explore OOP, inheritance, and encapsulation concepts in a real-world banking context.

## Features
- Abstract base class for shared account logic (`BankAccount`)
- Specific account types:
    - **Checking Account** with overdraft protection
    - **Savings Account** with interest calculations
- Easy-to-extend design for adding additional account types
- Basic demonstration of account transactions and testing via a main entry point

## Folder Structure

```
project-root/
├── assets/                          # All assets related to the project
│   ├── demo-videos/                 # Contains demo videos
│   └── screenshots/                 # Contains outcome screenshots
│       └── outcome.png              # Screenshot of the project's output
│
├── designs/                         # System design diagrams and documents
│   ├── constructor.png              # Constructor design
│   ├── fields.png                   # Field design
│   ├── methods.png                  # Methods design
│   └── inner_class.png              # Inner class design
│
├── src/                             # Source code directory
│   ├── models/                      # Contains core models of the project
│   │   ├── BankAccount.java         # Abstract base class
│   │   ├── CheckingAccount.java     # Checking account class with overdraft
│   │   └── SavingsAccount.java      # Savings account class with interest & withdrawal limits
│   ├── Main.java                    # Entry point/test class
│   └── README.md                    # Project documentation related to source code
│
├── LICENSE                          # License file for the project
└── README.md                        # Main project overview, setup, usage, etc.
```

## Getting Started

### Prerequisites

To run this project, you need:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (version 8 or higher)
- A Java IDE (such as IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/ewache04/BankAccount.git
   ```
2. Navigate to the `src` directory and open it in your preferred Java IDE.
3. Compile and run the `Main.java` file to execute the program.

## Usage

- The `Main.java` file serves as the entry point to test and demonstrate basic banking operations.
- You can create instances of `CheckingAccount` and `SavingsAccount` and perform actions like deposits, withdrawals, and checking balances.

## Design Documentation

Diagrams illustrating the system's design can be found in the `designs/` folder:
- **constructor.png**: Describes the constructor logic.
- **fields.png**: Shows field structure and relationships.
- **methods.png**: Outlines methods and their interactions.
- **inner_class.png**: Displays the inner class structure.

## Screenshots

Screenshots demonstrating the program's output can be found in the `assets/screenshots/` directory:
- **outcome.png**: Example screenshot of the program's output.

## License

This project is licensed under the terms of the [MIT License](LICENSE).

---
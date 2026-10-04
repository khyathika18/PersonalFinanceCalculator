# Personal Finance Calculator 💰

A simple Java console application that calculates monthly expenses, remaining income, and savings percentage based on user-provided financial information.

This project was created as a **Phase 0 Java Mini Project** to practice fundamental Java programming concepts and basic object-oriented programming.

## 📌 Project Overview

The **Personal Finance Calculator** takes the user's monthly income and expenses in different categories, calculates the total expenses, determines the remaining amount, and calculates the percentage of income that can be saved.

### Expense Categories

* 🍔 Food
* 🚗 Travel
* 📚 Education
* 🛍️ Others

## ✨ Features

* Accepts monthly income from the user
* Accepts expenses for different categories
* Calculates total monthly expenses
* Calculates remaining income after expenses
* Calculates savings percentage
* Displays a simple financial summary
* Uses separate classes to organize financial calculations

## 🛠️ Technologies Used

* **Java**
* **Java Scanner** for user input
* Object-Oriented Programming concepts

## 📚 Java Concepts Practiced

This project helped practice the following Java fundamentals:

* Variables and data types
* `Scanner` for user input
* Arithmetic operators
* Methods
* Classes and objects
* Constructors
* Encapsulation
* Private instance variables
* Getters
* Method parameters and return values
* Basic object-oriented programming

## 🏗️ Project Structure

```text
Personal-Finance-Calculator/
│
└── src/
    └── phase_0_mini_project/
        └── PersonalFinanceCalculator.java
```

### Classes

#### `PersonalFinanceCalculator`

Contains the `main()` method and handles:

* Reading user input
* Creating `Expense` objects
* Creating the `FinanceManager` object
* Displaying the final financial summary

#### `Expense`

Represents an individual expense.

It contains:

* `category`
* `amount`

The expense amount is accessed through the `getAmount()` method.

#### `FinanceManager`

Handles the financial calculations:

* Total expenses
* Remaining income
* Savings percentage

## ⚙️ How It Works

The program follows these steps:

```text
Enter Monthly Income
        ↓
Enter Food Expense
        ↓
Enter Travel Expense
        ↓
Enter Education Expense
        ↓
Enter Other Expenses
        ↓
Create Expense Objects
        ↓
Calculate Total Expenses
        ↓
Calculate Remaining Income
        ↓
Calculate Savings Percentage
        ↓
Display Financial Summary
```

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Open the project

Open the project in any Java-compatible IDE such as:

* IntelliJ IDEA
* Eclipse
* VS Code

### 3. Compile and run

Run:

```text
PersonalFinanceCalculator.java
```

Make sure Java is installed and configured on your system.

## 💻 Sample Input

```text
Enter the monthly income:
30000

Enter food expenses:
5000

Enter travel expenses:
3000

Enter education expenses:
4000

Enter others expenses:
2000
```

## 📊 Sample Output

```text
------Financial Summary------

Income: 30000.0 rps
Total Expenses: 14000.0 rps
Remaining: 16000.0 rps
Saving Percentage: 53.333333333333336 %
```

## 🚀 Future Improvements

Possible improvements for future versions:

* Add more expense categories dynamically
* Allow users to enter expenses repeatedly
* Add monthly expense history
* Add expense limits or budgets
* Display the highest expense category
* Add input validation
* Improve the formatting of currency and percentages
* Store financial data using files or a database
* Create a graphical user interface
* Add charts for expense analysis

## 🎯 Learning Objective

The main objective of this project was to strengthen Java fundamentals by building a small practical application instead of learning concepts only through isolated examples.

This project is part of my journey to rebuild and strengthen my Java programming skills through **project-based learning**.

## 👩‍💻 Author

**Khyathika Kaduthuri**

B.Tech – Electronics and Communication Engineering

---

⭐ If you find this project useful, feel free to explore the repository and follow my learning journey.

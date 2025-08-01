package GuviAssignment2;

//Account class with balance management
public class Account {
 private double balance;

 // No-argument constructor
 public Account() {
     this.balance = 0.0;
 }

 // Parameterized constructor
 public Account(double balance) {
     this.balance = balance;
 }

 // Method to deposit amount
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount");
     }
 }

 // Method to withdraw amount
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance");
     }
 }

 // Method to display balance
 public void displayBalance() {
     System.out.println("Current Balance: " + balance);
 }

 // Main method for testing
 public static void main(String[] args) {
     System.out.println("Testing Account Class:");
     Account account1 = new Account(); // No-arg constructor
     Account account2 = new Account(1000.0); // Parameterized constructor

     account1.deposit(500.0);
     account1.withdraw(200.0);
     account1.displayBalance();

     account2.deposit(300.0);
     account2.withdraw(1500.0); // Should fail
     account2.displayBalance();
 }
}

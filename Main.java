package Task;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Invalid deposit amount.");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

class ATM {
    private BankAccount userAccount;
    private Scanner scanner;

    public ATM(BankAccount account) {
        userAccount = account;
        scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        System.out.println("\nATM Options:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void start() {
        while (true) {
            displayOptions();
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (userAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        }
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (userAccount.deposit(amount)) {
            System.out.println("Deposit successful.");
        }
    }

    public void checkBalance() {
        userAccount.checkBalance();
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initialize bank account with initial balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}


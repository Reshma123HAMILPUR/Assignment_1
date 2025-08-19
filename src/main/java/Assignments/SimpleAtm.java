package Assignments;
import java.util.Scanner;
public class SimpleAtm {


//    public class SimpleAtm {
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in); // Create Scanner object

            int correctPIN = 1234; // Set the correct PIN
            int balance = 1000; // Starting balance

            System.out.print("Enter your 4-digit PIN: ");
            int enteredPIN = scanner.nextInt(); // Read PIN from user

            if (enteredPIN == correctPIN) {
                while (true) {
                    // Show menu
                    System.out.println("\n--- ATM Menu ---");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");

                    int choice = scanner.nextInt(); // Read user's menu choice

                    if (choice == 1) {
                        System.out.println("Your current balance is:$" + balance );
                    } else if (choice == 2) {

                    } else if (choice == 3) {
                        System.out.print("Enter amount to withdraw: ");
                        int withdraw = scanner.nextInt(); // Read withdraw amount
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                    } else if (choice == 4) {
                        System.out.println("Thank you. Exiting ATM.");
                        break; // Exit the loop
                    } else {
                        System.out.println("Invalid option. Try again.");
                    }
                }
            } else {
                System.out.println("Incorrect PIN. Access denied.");
            }

            scanner.close(); // Always close the scanner
        }
    }



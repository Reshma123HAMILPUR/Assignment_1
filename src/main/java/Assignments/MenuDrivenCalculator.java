package Assignments;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object to read input from the keyboard/user (System.in)
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store user choices and numbers

        int choice; // To store the menu option selected
        double num1, num2, result; // to store two numbers and the result of the operation

        // Start an infinite loop that breaks only when the user chooses Exit (option 5)

        while (true){

            System.out.println("\n --- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            //Prompt user to enter a menu option (1-5)
            System.out.print("Choose an option: ");

            choice = scanner.nextInt(); // Read integer input from user

            // Exit the loop if user selects 5
            if (choice == 5){
                System.out.println("Exit calculator. Goodbye!");
                break;
            }

            //Prompt user to enter two numbers for the calculation
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble(); // Read the first number as double from the user

            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble(); // Read the second number as double from the user

            // Use a switch statement to perform operation based on user's choice
            switch (choice){
                case 1:
                    result = num1 + num2;

                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result " + result);
                    break;

                case 4:
                    if (num2 !=0) { //Prevent division by zero
                        result = num1 / num2;
                        System.out.println("Result " + result);
                    }else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 5");
            }

        }
        //Close scanner to free system resources (best practice)
        scanner.close();

    }

}
package Assignments;

public class OperatorMastery {


        public static void main(String[] args) {
            // Step 1: Declare and initialize two integer variables

            int a = 20;
            int b = 10;

            // Step 2: Perform arithmetic operations
            int addition = a + b;
            int subtraction = a - b;
            int multiplication = a * b;
            int division = a / b;

            // Step 2b: Compare if a is greater than b (Relational operator)
            boolean isAGreaterThanB = a > b;

            // step 2c: Logical AND operatrion to check two conditions

            boolean bothConditions = (a > b) && (b > 0);

            //Step 3: Print the results
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division);
            System.out.println("Is a greater than b? " + isAGreaterThanB);
            System.out.println("Is a > b and b > 0? " + bothConditions);
        }
    }


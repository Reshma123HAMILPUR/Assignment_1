package R_Assesment_1;

//public class AverageCalculator {

    import java.util.Scanner;  // To take input from user

    public class AverageCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Create Scanner object

            // Asking user for 3 numbers
            System.out.print("Enter first number (A): ");
            int A = sc.nextInt();   // input first number

            System.out.print("Enter second number (B): ");
            int B = sc.nextInt();   // input second number

            System.out.print("Enter third number (C): ");
            int C = sc.nextInt();   // input third number

            // Formula: average = sum of numbers / 3
            double average = (A + B + C) / 3.0;  // use 3.0 to get decimal result

            // Output the result
            System.out.println("The average of " + A + ", " + B + " and " + C + " is: " + average);
        }
    }




package R_Assesment_1;

//public class Factorial {

    import java.util.Scanner;  // Import Scanner for input

    public class Factorial {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Scanner object

            // Ask user for a number
            System.out.print("Enter a number: ");
            int n = sc.nextInt();  // Read number from user

            long fact = 1;  // Variable to store factorial (long used for big numbers)

            // Calculate factorial using loop
            for (int i = 1; i <= n; i++) {
                fact = fact * i;   // multiply each number
            }

            // Print result
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }




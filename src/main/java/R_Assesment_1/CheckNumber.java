package R_Assesment_1;

//public class Positive_Or_Negative {

    import java.util.Scanner;  // Import Scanner for input

    public class CheckNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Scanner object

            // Ask user for a number
            System.out.print("Enter a number: ");
            int number = sc.nextInt();  // Read integer input

            // Check conditions
            if (number >= 0) {
                System.out.println(number + " is Positive.");
            } else if (number <= 0) {
                System.out.println(number + " is Negative.");
            } else {
                System.out.println("The number is invalid");
            }
        }
    }




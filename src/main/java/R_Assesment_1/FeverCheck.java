package R_Assesment_1;

//public class FeverCheck {

    import java.util.Scanner;  // Import Scanner for input

    public class FeverCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Scanner object

            // Ask user to enter temperature
            System.out.print("Enter your body temperature: ");
//            double temp = 103.5;
            double temp = sc.nextFloat();  // Read input as float (decimal allowed)

            // Check condition
            if (temp > 100) {
                System.out.println("You have a fever");
            } else {
                System.out.println("You don't have a fever");
            }
        }
    }




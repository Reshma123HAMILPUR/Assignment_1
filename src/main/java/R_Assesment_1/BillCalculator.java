package R_Assesment_1;

//public class VariableAndDataType {

    import java.util.Scanner;  // To take input from user

    public class BillCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Scanner object for input

            // Asking user for the cost of each item
            System.out.print("Enter cost of Pencil: ");
            float pencil = sc.nextFloat();   // input float value

            System.out.print("Enter cost of Pen: ");
            float pen = sc.nextFloat();

            System.out.print("Enter cost of Eraser: ");
            float eraser = sc.nextFloat();

            // Calculate total cost
            float total = pencil + pen + eraser;

            // Calculate GST (18%)
            float gst = (total * 18) / 100;

            // Final bill amount = total + gst
            float finalBill = total + gst;

            // Print results
            System.out.println("\n----- BILL DETAILS -----");
            System.out.println("Total (without GST): " + total);
            System.out.println("GST (18%): " + gst);
            System.out.println("Final Bill (with GST): " + finalBill);
        }
    }




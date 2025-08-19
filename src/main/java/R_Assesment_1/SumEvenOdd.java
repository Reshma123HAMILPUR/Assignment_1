package R_Assesment_1;

//public class SumEvenOdd {

    import java.util.Scanner;

    public class SumEvenOdd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int evenSum = 0;  // to store sum of even numbers Examples even: 2, 4, 6, 8, 10
            int oddSum = 0;   // to store sum of odd numbers  Examples odd : 1, 3, 5, 7, 9

            System.out.print("How many numbers do you want to enter? ");
            int n = sc.nextInt();  // total numbers user will enter

            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();  // read each number

                if (num % 2 == 0) {  // check if even
                    evenSum += num;
                } else {             // otherwise odd
                    oddSum += num;
                }
            }

            // print the results
            System.out.println("Sum of even numbers = " + evenSum);
            System.out.println("Sum of odd numbers = " + oddSum);
        }
    }




package Assignments;

public class TypeCastingOperation {
//    public class TypeCastingOperations {
        public static void main(String[] args) {
            // Step 1: Declare variables of int and double

            int a =  9;
            double b = 4.0;

            // Step 2: Cast a to double and add to b
            double sum = (double) a + b;

            // step 2b : Divide a by b (int / double = double )
            double  division = a/b;

            // step 2c: Cast b to int, then compare a > (int)b
            boolean isAGreaterThanCastB = a > (int)b ;

            //step 2d:  Check if a is divisible by 3 AND b > 2.5
            boolean logicalCheck =  (a % 3 == 0) && (b > 2.5);

            // step 3: Print results
            System.out.println("sum (a + b): " + sum);
            System.out.println("Division (a / b): " + division);
            System.out.println("Is a > (int)b? " + isAGreaterThanCastB);
            System.out.println("Is a divisible by 3 and b > 2.5? " + logicalCheck);





        }
    }


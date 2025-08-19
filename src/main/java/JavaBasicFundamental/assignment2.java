package JavaBasicFundamental;

public class assignment2 {
    public static void main(String[] args){

        int a = 9;
        double b = 4.0;

        // 2a. Cast a to double and add to b
        double sum = (double) a + b;

        // 2b. Divide a by b and store the result
        double division = a / b;

        // 2c. Cast b to int and compare if a > (int)b
        boolean isGreater = a > (int) b;

        // 2d. Check if a is divisible by 3 AND b > 2.5
        boolean condition = (a % 3 == 0) && (b > 2.5);

        // 3. Print all results
        System.out.println("Sum (a + b): " + sum);
        System.out.println("Division (a / b): " + division);
        System.out.println("Is a > (int)b? " + isGreater);
        System.out.println("Is a divisible by 3 and b > 2.5? " + condition);

    }
}

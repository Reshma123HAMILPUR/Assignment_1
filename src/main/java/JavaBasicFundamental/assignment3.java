package JavaBasicFundamental;

public class assignment3 {
    public static void main(String[] args) {
        double x = 22.7;
        int y = 4;

        // 2a. Cast x to int, then find (int)x % y
        int modResult = (int) x % y;

        // 2b. Cast y to double and add to x
        double sum = x + (double) y;

        // 2c. Check if (int)x equals y * 5
        boolean isEqual = (int) x == y * 5;

        // 2d. Check if x > 20 AND y < 10
        boolean condition = (x > 20) && (y < 10);

        // 3. Print results
        System.out.println("(int)x % y: " + modResult);
        System.out.println("x + (double)y: " + sum);
        System.out.println("Is (int)x equal to y * 5? " + isEqual);
        System.out.println("Is x > 20 and y < 10? " + condition);
    }
}
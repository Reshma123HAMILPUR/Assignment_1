package R_Assesment_1;

//public class TernaryExample {

public class TernaryExample {
    public static void main(String[] args) {
        int a = 63;
        int b = 36;

        // Ternary operator: (condition) ? value_if_true : value_if_false
        // Check if a > b
        boolean x = (a > b) ? true : false;

        // y will get the bigger value between a and b
        int y = (a > b) ? a : b;

        // Print values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}




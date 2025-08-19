package ConditionalStatements;

public class IfElseif {
    public static void main(String[] args) {
        //instantiating a variable  declaration

        int x = 38;
        int y = 17;
        int z = 26;

        // checking greatest value between the 3
        //setting our  conditions

        if (x > y && x > z) {
            System.out.println("X is the greatest value: " + x);
        } else if (y > z && y > x) {
            System.out.println(" y is the greatest number: " + y);
        } else {
            System.out.println("Z is the greatest number: " + z);
        }

    }
}

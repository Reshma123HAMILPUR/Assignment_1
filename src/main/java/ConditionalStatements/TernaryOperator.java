package ConditionalStatements;

public class TernaryOperator {
    public static void main(String[] args){
        // ternary operator: is simply operated by using ?:

        //check if number is even

        int n = 4;
        int result = 0;

        //let us use if else statement

        if ( n % 2 == 0)
            System.out.println("result = 10");
        else
            System.out.println("result = 20");

        // using ternary operator
        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }


}

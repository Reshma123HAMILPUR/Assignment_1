package ConditionalStatements;

public class IfElse {
    public static void main(String[] args) {

        // initiating a variable
//a.

        int x = 18;

        //setting a condition

        if (x > 20)
            System.out.println("wellcome to today's class");
        else
            System.out.println("goodbye we are done for today");

//b.
        int y = 12;

        if(y >19 && y <= 20 )
            System.out.println("goodbye");
        else
            System.out.println("well come to home");

//c.
         if (x>y){
             System.out.println("the greatest number is: " + x );
         }
else {
    System.out.println("the greatest number is: " + y);
         }
    }
}

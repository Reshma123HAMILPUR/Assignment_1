package ConditionalStatements;

public class SwitchStatement {
    // Switch statement : this used when we have multiple cases or conditions and these keywords are used;
    // switch case break and default

    public static void main(String[] args){
        // let us print day of the week based on the below condition

        int n = 6;

        // let  us ckeck by using if else statement
        if  (n == 1)
            System.out.println("monday");
        else if (n == 2)
            System.out.println("tuesday");
        else if (n == 3)
            System.out.println("wednesday");
        else if (n == 5)
            System.out.println("thursday");
        else if (n == 6)
            System.out.println("Friday");
        else if (n == 7)
            System.out.println("saturday");
        else
            System.out.println("sunday");

        //b. using switch statements

        int z = 2;
        switch (z){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("saturday");
            default:
                System.out.println("condition is not  valid in all case: ");
        }



    }
}

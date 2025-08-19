package ConditionalStatements;

public class FoorLoop {
    // we have finite abd infinite loop
    //finite loop : is a loop that a short and an end
    // infinite loop: is a loop that has no end because no because no condition or break is being declared or set.

    public static void main(String[] args){
        int i = 1;

        //using while loop

        while ( i <=4){
            System.out.println("hi" + i);

            // increment
            i++;
        }
        // using for loop
        for (int j = 1;  i<=4; j++){
            System.out.println("hi you highly to loop exploration. " + j);

        }
        //using for loop (decrement)

        for (int z = 4; z>=1; z--){
            System.out.println("thank you for your." + z);
        }
    }



}


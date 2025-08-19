package Assignments;

public class MultipleOfThree {


        public static void main(String[] args) {
            System.out.print("Multiples of 3 from 1 to 20: ");

            //Run for loop
            for (int i = 1; i<=20; i++){
                if (i % 3 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }


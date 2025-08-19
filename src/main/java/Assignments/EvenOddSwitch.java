package Assignments;

public class EvenOddSwitch {


        public static void main(String[] args) {
            int num = 6;

            // Check if number is even or odd using switch

            switch  (num % 2){
                case 0:
                    System.out.println("Number is an Even Number");
                    break;
                case 1:
                    System.out.println("Number is an Odd number");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }



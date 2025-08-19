package Assignments;

public class ChacterUnicode {


        public static void main(String[] args) {
            char letter =  'A';

            // cast cahr to int to get the unicode value ofm A
            int unicode= (int) letter;

            // Add 1 to the character
            char nextLetter = (char) (letter + 1); // A + 1 = B

            // Print result
            System.out.println("Unicode of A: " + unicode);
            System.out.println("Next letter: " + nextLetter);
        }
    }


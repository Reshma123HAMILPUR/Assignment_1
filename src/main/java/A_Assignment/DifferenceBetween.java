package A_Assignment;

import java.util.ArrayList;



    public class DifferenceBetween {
        public static void main(String[] args) {


            // Create an ArrayList of Strings
            ArrayList<String> list = new ArrayList<>();

            // Initially, the list is empty
            System.out.println("Initial size: " + list.size());     // Output: 0
            System.out.println("Is list empty? " + list.isEmpty()); // Output: true

            // Add some elements
            list.add("Apple");
            list.add("Banana");

            // Now check again
            System.out.println("\nAfter adding elements:");
            System.out.println("Current size: " + list.size());     // Output: 2
            System.out.println("Is list empty? " + list.isEmpty()); // Output: false

            // Remove all elements
            list.clear();

            // Check again after clearing
            System.out.println("\nAfter clearing list:");
            System.out.println("Final size: " + list.size());       // Output: 0
            System.out.println("Is list empty? " + list.isEmpty()); // Output: true
        }
    }



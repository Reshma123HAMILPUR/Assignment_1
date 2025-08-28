package A_Assignment;
import java.util.LinkedList;
public class LinkedListOfString {

//    package collections.com;

//import java.util.LinkedList;

    public static class LinkedListOfStrings {
        public static void main(String[] args) {
            // Create LinkedList of Strings
            LinkedList<String> names = new LinkedList<>();

            // Add 5 names
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");
            names.add("Eve");

            // Retrieve the 3rd element (index starts from 0, so index = 2)
            String thirdName = names.get(2);

            // Print the 3rd element
            System.out.println("The 3rd element is: " + thirdName);
        }
    }

}

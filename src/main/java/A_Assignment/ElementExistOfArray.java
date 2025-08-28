package A_Assignment;
import java.util.ArrayList;
public class ElementExistOfArray {

//    collections.com;

//import java.util.ArrayList;

    public class elementExistOfArray {
        public static void main(String[] args) {

            // Create an ArrayList of Strings
            ArrayList<String> names = new ArrayList<>();

            // Add some elements
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");

            // Element to search
            String searchName = "Charlie";

            // Check if the element exists using contains()
            if (names.contains(searchName)) {
                System.out.println(searchName + " exists in the ArrayList.");
            } else {
                System.out.println(searchName + " does not exist in the ArrayList.");
            }

            // Another search example
            String anotherName = "Eve";
            if (names.contains(anotherName)) {
                System.out.println(anotherName + " exists in the ArrayList.");
            } else {
                System.out.println(anotherName + " does not exist in the ArrayList.");
            }
        }
    }

}

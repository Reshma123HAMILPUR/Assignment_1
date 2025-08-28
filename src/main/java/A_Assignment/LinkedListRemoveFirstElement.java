package A_Assignment;
import java.util.LinkedList;
public class LinkedListRemoveFirstElement {



//    public class LinkedListRemoveofFirstElement {
        public static void main(String[] args) {

            // Create a LinkedList
            LinkedList<String> list = new LinkedList<>();

            // Add elements
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
            list.add("Date");
            list.add("Elderberry");

            // Print original list
            System.out.println("Original LinkedList: " + list);

            // Remove first element
            list.removeFirst();

            // Remove last element
            list.removeLast();

            // Print modified list
            System.out.println("After removing first and last: " + list);
        }
    }



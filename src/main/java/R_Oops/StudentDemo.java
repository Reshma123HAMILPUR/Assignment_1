package R_Oops;

//public class Student {

    // Class definition
    class Student {
        // Data members (variables)
        String name;
        int rollNumber;
        float marks;

        // Method to display student details
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("---------------------");
        }
    }

    // Main class
    public class StudentDemo {
        public static void main(String[] args) {
            // Create first student object
            Student s1 = new Student();
            s1.name = "Reshma";
            s1.rollNumber = 1;
            s1.marks = 80.5f;

            // Create second student object
            Student s2 = new Student();
            s2.name = "Kavita";
            s2.rollNumber = 2;
            s2.marks = 90.0f;

            // Display both students' details
            s1.display();
            s2.display();
        }
    }




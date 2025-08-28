package R_Assesment_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class student_management {

//    import java.util.*;

    // 🔹 Abstraction using Interface
    interface DatabaseOperations {
        void addStudent(Student student);
        void updateStudent(int id, String name, String course, int marks);
        void deleteStudent(int id);
        void viewStudents();
    }

    // 🔹 Base class (Inheritance)
    static class Person {
        protected int id;
        protected String name;

        // Constructor
        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    // 🔹 Student class (Inheritance + Encapsulation)
    static class Student extends Person {
        private String course;
        private int marks;

        public Student(int id, String name, String course, int marks) {
            super(id, name); // call Person constructor
            this.course = course;
            this.marks = marks;
        }

        // Encapsulation: getters and setters
        public String getCourse() { return course; }
        public void setCourse(String course) { this.course = course; }

        public int getMarks() { return marks; }
        public void setMarks(int marks) { this.marks = marks; }

        // Polymorphism: method overriding
        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name +
                    ", Course: " + course + ", Marks: " + marks;
        }

        // Polymorphism: method overloading
        public void displayResult() {
            System.out.println(name + " scored " + marks + " marks.");
        }

        public void displayResult(String grade) {
            System.out.println(name + " scored " + marks + " marks and Grade: " + grade);
        }
    }

    // 🔹 Teacher class (Inheritance)
    static class Teacher extends Person {
        private final String subject;

        public Teacher(int id, String name, String subject) {
            super(id, name);
            this.subject = subject;
        }

        @Override
        public String toString() {
            return "Teacher ID: " + id + ", Name: " + name + ", Subject: " + subject;
        }
    }

    // 🔹 StudentDatabase class (Implements abstraction)
    static class StudentDatabase implements DatabaseOperations {
        private final Map<Integer, Student> students = new HashMap<>();

        @Override
        public void addStudent(Student student) {
            students.put(student.id, student);
            System.out.println("✅ Student added successfully!");
        }

        @Override
        public void updateStudent(int id, String name, String course, int marks) {
            Student s = students.get(id);
            if (s != null) {
                s.name = name;
                s.setCourse(course);
                s.setMarks(marks);
                System.out.println("✅ Student updated successfully!");
            } else {
                System.out.println("⚠️ Student not found!");
            }
        }

        @Override
        public void deleteStudent(int id) {
            if (students.remove(id) != null) {
                System.out.println("✅ Student deleted successfully!");
            } else {
                System.out.println("⚠️ Student not found!");
            }
        }

        @Override
        public void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("⚠️ No students available.");
            } else {
                for (Student s : students.values()) {
                    System.out.println(s);
                }
            }
        }
    }

    // 🔹 Main class
    public static class StudentManagementSystem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentDatabase db = new StudentDatabase();

            while (true) {
                System.out.println("\n=== Student Management Menu ===");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();
                        db.addStudent(new Student(id, name, course, marks));
                        break;

                    case 2:
                        db.viewStudents();
                        break;

                    case 3:
                        System.out.print("Enter ID to update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String uname = sc.nextLine();
                        System.out.print("Enter New Course: ");
                        String ucourse = sc.nextLine();
                        System.out.print("Enter New Marks: ");
                        int umarks = sc.nextInt();
                        db.updateStudent(uid, uname, ucourse, umarks);
                        break;

                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();
                        db.deleteStudent(did);
                        break;

                    case 5:
                        System.out.println("✅ Exiting program...");
                        sc.close();
                        return;

                    default:
                        System.out.println("⚠️ Invalid choice! Try again.");
                }
            }
        }
    }


}

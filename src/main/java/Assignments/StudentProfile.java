package Assignments;

public class StudentProfile {

//    public class StudentProfile {
        public static void main(String[] args) {

            String studentName = "Rakshata";

            byte level = 3; //(-128 to 127)

            short score = 92;  // (-32,768 to 32,767)

            int age = 20;

            long studentId = 2023001245L;

            float weight = 55.8f;

            double height = 1.75;

            char grade = 'A';

            boolean hasClearedFee = true;

            System.out.println("Student Name: " + studentName);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight + "kg");
            System.out.println("Height: " + height + "m");
            System.out.println("Grade: " + grade);
            System.out.println("Has Cleared fee: " + hasClearedFee);
            System.out.println("Score: " + score);
            System.out.println("Level: " + level);
            System.out.println("Student ID: " + studentId);

        }
    }


package Assignments;

public class GradeEvaluator {

        public static void main(String[] args) {
            int score = 99;
            char grade;

            if (score >= 90){
                grade = 'A';
            }else if(score >= 75){
                grade = 'B';
            }else if  (score >= 60){
                grade = 'C';
            }else {
                grade = 'D';
            }
            //Print the assigned grade
            System.out.println("Grade: " + grade);
        }
    }



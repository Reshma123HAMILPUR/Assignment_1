package CWHSET;

 class Encapsulation {
//    class Student {
        private String name; // private variable (hidden from outside)

        public void setName(String n) { // public method to set value
            name = n;
        }

        public String getName() { // public method to get value
            return name;
        }
    }

     class Main {
        public static void main(String[] args) {
            Encapsulation s = new Encapsulation();
            s.setName("Reshma"); // set name
            System.out.println(s.getName()); // get name
        }
    }



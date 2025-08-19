package R_Oops;

//public class Shape {

    // Parent class
    class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    // Subclass Circle
    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Subclass Square
    class Square extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Square");
        }
    }

    // Main class
    public class PolymorphismExample {
        public static void main(String[] args) {
            // Shape reference but Circle object
            Shape s1 = new Circle();
            s1.draw();   // Output: Drawing a Circle

            // Shape reference but Square object
            Shape s2 = new Square();
            s2.draw();   // Output: Drawing a Square
        }
    }




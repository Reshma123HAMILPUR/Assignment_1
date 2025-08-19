package R_Oops;

//public class Animal {

    // Parent class
    class Animal {
        // method in parent class
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class (Dog) inherits from Animal
    class Dog extends Animal {
        // overriding the sound() method
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    // Main class
    public class InheritanceExample {
        public static void main(String[] args) {
            // Create object of Dog
            Dog d = new Dog();

            // Call sound() method
            d.sound();
        }
    }




public class Polymorphism {

    // Method Overloading
    static class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Method Overriding
    static class Animal {

        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Cat extends Animal {

        @Override
        void sound() {
            System.out.println("Cat says Meow");
        }
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition 1: " + calc.add(10, 20));
        System.out.println("Addition 2: " + calc.add(10, 20, 30));

        Animal animal = new Cat();
        animal.sound();
    }
}

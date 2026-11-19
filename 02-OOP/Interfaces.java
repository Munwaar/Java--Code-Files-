public class Interfaces {

    // Creating an interface
    interface Animal {
        void sound();
        void eat();
    }

    // Implementing the interface
    static class Dog implements Animal {

        @Override
        public void sound() {
            System.out.println("Dog barks");
        }

        @Override
        public void eat() {
            System.out.println("Dog eats food");
        }
    }

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.sound();
        myDog.eat();
    }
}

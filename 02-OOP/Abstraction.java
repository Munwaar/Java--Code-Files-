public class Abstraction {

    // Abstract class
    abstract static class Vehicle {

        abstract void start();

        void stop() {
            System.out.println("Vehicle stopped");
        }
    }

    // Child class
    static class Car extends Vehicle {

        @Override
        void start() {
            System.out.println("Car starts with a key");
        }
    }

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.start();
        myCar.stop();
    }
}

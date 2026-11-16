// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Parent class methods
        dog.eat();
        dog.sleep();

        // Child class method
        dog.bark();
    }
}

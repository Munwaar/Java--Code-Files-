class Car {

    String brand;
    String color;
    int speed;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    void accelerate() {
        speed += 20;
        System.out.println("New Speed: " + speed + " km/h");
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {

        // Creating first object
        Car car1 = new Car();

        car1.brand = "BMW";
        car1.color = "Black";
        car1.speed = 100;

        System.out.println("Car 1 Details:");
        car1.displayDetails();
        car1.accelerate();

        System.out.println();

        // Creating second object
        Car car2 = new Car();

        car2.brand = "Audi";
        car2.color = "White";
        car2.speed = 120;

        System.out.println("Car 2 Details:");
        car2.displayDetails();
        car2.accelerate();
    }
}

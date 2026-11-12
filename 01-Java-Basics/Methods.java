public class Methods {

    // Method without parameters
    static void greet() {
        System.out.println("Welcome to Java!");
    }

    // Method with parameters
    static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with return value
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method to find square
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        // Calling methods
        greet();

        add(10, 20);

        int result = multiply(5, 4);
        System.out.println("Multiplication: " + result);

        int value = square(6);
        System.out.println("Square: " + value);
    }
}

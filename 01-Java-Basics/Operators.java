public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Greater: " + (a > b));
        System.out.println("Less: " + (a < b));

        // Logical Operators
        System.out.println("Logical AND: " + (a > 5 && b > 5));
        System.out.println("Logical OR: " + (a > 25 || b > 5));
        System.out.println("Logical NOT: " + (!(a > b)));

        // Assignment Operator
        a += 5;
        System.out.println("After a += 5: " + a);
    }
}

public class UserDefinedException {

    // Creating a custom exception
    static class InvalidAgeException extends Exception {

        InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method to check age
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above"
            );
        }

        System.out.println("Access granted");
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        }

        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

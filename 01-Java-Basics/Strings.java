
public class Strings {

    public static void main(String[] args) {

        String name = "Munwaar";
        String another = "Java Programming";

        // Display string
        System.out.println("Name: " + name);

        // Find string length
        System.out.println("Length: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Get character at index
        System.out.println("Character at index 2: " + name.charAt(2));

        // Check if string contains text
        System.out.println("Contains Java: " + another.contains("Java"));

        // Compare strings
        String str1 = "Java";
        String str2 = "Java";

        System.out.println("Are strings equal: " + str1.equals(str2));

        // Extract substring
        System.out.println("Substring: " + another.substring(0, 4));

    }
}

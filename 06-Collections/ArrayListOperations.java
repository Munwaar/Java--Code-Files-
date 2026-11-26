import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        // Adding elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("JavaScript");

        System.out.println("Original List: " + languages);

        // Accessing an element
        System.out.println("First Language: " + languages.get(0));

        // Updating an element
        languages.set(1, "C++");

        System.out.println("After Update: " + languages);

        // Removing an element
        languages.remove("C");

        System.out.println("After Removal: " + languages);

        // Checking list size
        System.out.println("List Size: " + languages.size());

        // Checking whether an element exists
        System.out.println("Contains Java: " + languages.contains("Java"));

        // Traversing the ArrayList
        System.out.println("All Languages:");

        for (String language : languages) {
            System.out.println(language);
        }
    }
}

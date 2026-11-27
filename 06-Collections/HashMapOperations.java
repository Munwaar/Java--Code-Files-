import java.util.HashMap;

public class HashMapOperations {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Adding elements
        students.put(101, "Munwaar");
        students.put(102, "Varun");
        students.put(103, "Vignesh");

        System.out.println("Original Map: " + students);

        // Accessing a value
        System.out.println("Student 101: " + students.get(101));

        // Updating a value
        students.put(102, "Arun");

        System.out.println("After Update: " + students);

        // Checking whether a key exists
        System.out.println("Contains Key 103: "
                + students.containsKey(103));

        // Removing an element
        students.remove(103);

        System.out.println("After Removal: " + students);

        // Displaying all key-value pairs
        System.out.println("Student Records:");

        for (Integer id : students.keySet()) {
            System.out.println(id + " : " + students.get(id));
        }

        // Displaying total entries
        System.out.println("Total Students: " + students.size());
    }
}

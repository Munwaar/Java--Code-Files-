import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsDemo {

    public static void main(String[] args) {

        // ArrayList example
        ArrayList<String> names = new ArrayList<>();

        names.add("Munwaar");
        names.add("Varun");
        names.add("Vignesh");

        System.out.println("ArrayList: " + names);

        // HashSet example
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("HashSet: " + numbers);

        // HashMap example
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Munwaar");
        students.put(102, "Varun");
        students.put(103, "Vignesh");

        System.out.println("HashMap: " + students);
        System.out.println("Student 101: " + students.get(101));
    }
}

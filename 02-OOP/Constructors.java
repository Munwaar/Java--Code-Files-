
class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 18;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------");
    }
}

public class Constructors {

    public static void main(String[] args) {

        // Calling default constructor
        Student s1 = new Student();
        s1.display();

        // Calling parameterized constructor
        Student s2 = new Student("Munwaar", 18);
        s2.display();
    }
}

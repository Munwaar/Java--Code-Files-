import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {

        // Writing into a file
        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Hello Java!");
            writer.write("\nLearning File Handling.");

            writer.close();

            System.out.println("File written successfully");
        }

        catch (IOException e) {
            System.out.println("Writing error: " + e.getMessage());
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader("sample.txt");

            int character;

            System.out.println("\nFile Content:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
        }

        catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }
    }
}

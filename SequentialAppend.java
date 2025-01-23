import java.io.FileWriter;
import java.io.IOException;

    public class SequentialAppend {
        public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("output.txt", true)) {
                writer.write("\nThis is appended text.");
                System.out.println("Data appended successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


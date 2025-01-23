import java.io.FileWriter;
import java.io.IOException;

    public class SequentialFileWrite {
        public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write("This is a sequential file write example.\n");
                writer.write("Hello, world!");
                System.out.println("Data written successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


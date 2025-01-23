import java.io.RandomAccessFile;

    public class RandomUpdate {
        public static void main(String[] args) {
            try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")) {
                raf.seek(5); // Move the pointer to the 5th byte
                raf.writeUTF("updated");
                System.out.println("File updated successfully.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

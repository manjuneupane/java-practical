import java.io.RandomAccessFile;

    public class RandomWrite {
        public static void main(String[] args) {
            try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")) {
                raf.writeUTF("This is random access file writing.");
                System.out.println("Data written to the file.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


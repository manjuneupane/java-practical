import java.io.RandomAccessFile;

    public class RandomRead {
        public static void main(String[] args) {
            try (RandomAccessFile raf = new RandomAccessFile("random.txt", "r")) {
                String data = raf.readUTF();
                System.out.println("Data read: " + data);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


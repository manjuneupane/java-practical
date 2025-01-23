import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

    class Student implements Serializable {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }

    public class ObjectFileDemo {
        public static void main(String[] args) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
                oos.writeObject(new Student("John", 20));
                System.out.println("Object written successfully.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
                Student student = (Student) ois.readObject();
                System.out.println("Read object: " + student);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


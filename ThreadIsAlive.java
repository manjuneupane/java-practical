public class ThreadIsAlive {
        public static void main(String[] args) {
            Thread thread = new Thread(() -> {
                System.out.println("Thread is running.");
            });

            thread.start();

            System.out.println("Is thread alive? " + thread.isAlive());
        }
    }


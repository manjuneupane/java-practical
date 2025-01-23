public class ThreadPriority {
        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                System.out.println("Low priority thread is running.");
            });

            Thread thread2 = new Thread(() -> {
                System.out.println("High priority thread is running.");
            });

            thread1.setPriority(Thread.MIN_PRIORITY); // Low priority
            thread2.setPriority(Thread.MAX_PRIORITY); // High priority

            thread1.start();
            thread2.start();
        }
    }


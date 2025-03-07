import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeQueueTest {
    public static void main(String[] args) {
        ThreadSafeQueue<Integer> queue = new ThreadSafeQueue<>(5);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Producer threads
        executor.execute(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.enqueue(i);
                    Thread.sleep(500);  // Simulate work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer threads
        executor.execute(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.dequeue();
                    Thread.sleep(1000);  // Simulate work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executor.shutdown();
    }
}

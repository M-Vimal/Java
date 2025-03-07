import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    private final Semaphore[] forks;

    public DiningPhilosophers(int numPhilosophers) {
        forks = new Semaphore[numPhilosophers];
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Semaphore(1);  // Each fork can be used by one philosopher at a time
        }
    }

    public void dine(int philosopherId) {
        try {
            while (true) {
                think(philosopherId);

                // Pick up forks in a way to avoid deadlock
                if (philosopherId % 2 == 0) {  // Even philosophers pick right fork first
                    pickUpFork(philosopherId, (philosopherId + 1) % forks.length);
                    pickUpFork(philosopherId, philosopherId);
                } else {  // Odd philosophers pick left fork first
                    pickUpFork(philosopherId, philosopherId);
                    pickUpFork(philosopherId, (philosopherId + 1) % forks.length);
                }

                eat(philosopherId);

                // Put down forks
                putDownFork(philosopherId, philosopherId);
                putDownFork(philosopherId, (philosopherId + 1) % forks.length);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void think(int philosopherId) throws InterruptedException {
        System.out.println("Philosopher " + philosopherId + " is thinking...");
        Thread.sleep((long) (Math.random() * 2000));
    }

    private void pickUpFork(int philosopherId, int forkId) throws InterruptedException {
        forks[forkId].acquire();
        System.out.println("Philosopher " + philosopherId + " picked up fork " + forkId);
    }

    private void eat(int philosopherId) throws InterruptedException {
        System.out.println("Philosopher " + philosopherId + " is eating...");
        Thread.sleep((long) (Math.random() * 2000));
    }

    private void putDownFork(int philosopherId, int forkId) {
        forks[forkId].release();
        System.out.println("Philosopher " + philosopherId + " put down fork " + forkId);
    }

    public static void main(String[] args) {
        int numPhilosophers = 5;
        DiningPhilosophers diningPhilosophers = new DiningPhilosophers(numPhilosophers);

        Thread[] philosophers = new Thread[numPhilosophers];
        for (int i = 0; i < numPhilosophers; i++) {
            final int philosopherId = i;
            philosophers[i] = new Thread(() -> diningPhilosophers.dine(philosopherId));
            philosophers[i].start();
        }
    }
}

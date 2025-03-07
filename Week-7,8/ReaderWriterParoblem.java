import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

class ReaderWriterProblem {
    private static int readCount = 0;  // Number of active readers
    private static final ReentrantLock readCountLock = new ReentrantLock();
    private static final Semaphore resourceLock = new Semaphore(1);  // Only one writer at a time

    static class Reader implements Runnable {
        private final int readerId;

        public Reader(int id) {
            this.readerId = id;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    // Request read access
                    readCountLock.lock();
                    readCount++;
                    if (readCount == 1) {  // First reader locks resource
                        resourceLock.acquire();
                    }
                    readCountLock.unlock();

                    // Reading section
                    System.out.println("Reader " + readerId + " is reading...");
                    Thread.sleep((long) (Math.random() * 3000));

                    // Release read access
                    readCountLock.lock();
                    readCount--;
                    if (readCount == 0) {  // Last reader unlocks resource
                        resourceLock.release();
                    }
                    readCountLock.unlock();

                    Thread.sleep((long) (Math.random() * 3000));  // Simulate time before next read
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class Writer implements Runnable {
        private final int writerId;

        public Writer(int id) {
            this.writerId = id;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    // Request write access
                    resourceLock.acquire();

                    // Writing section
                    System.out.println("Writer " + writerId + " is writing...");
                    Thread.sleep((long) (Math.random() * 4000));

                    // Release write access
                    resourceLock.release();

                    Thread.sleep((long) (Math.random() * 3000));  // Simulate time before next write
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        int numReaders = 5;
        int numWriters = 2;

        Thread[] readers = new Thread[numReaders];
        Thread[] writers = new Thread[numWriters];

        for (int i = 0; i < numReaders; i++) {
            readers[i] = new Thread(new Reader(i + 1));
            readers[i].start();
        }

        for (int i = 0; i < numWriters; i++) {
            writers[i] = new Thread(new Writer(i + 1));
            writers[i].start();
        }
    }
}

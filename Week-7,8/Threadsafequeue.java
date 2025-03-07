import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeQueue<T> {
    private final T[] queue;
    private int front, rear, size;
    private final int capacity;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    @SuppressWarnings("unchecked")
    public ThreadSafeQueue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];  // Generic array creation workaround
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void enqueue(T item) throws InterruptedException {
        lock.lock();
        try {
            while (size == capacity) {
                System.out.println(Thread.currentThread().getName() + " waiting to enqueue...");
                notFull.await();  // Wait if queue is full
            }

            queue[rear] = item;
            rear = (rear + 1) % capacity;
            size++;

            System.out.println(Thread.currentThread().getName() + " enqueued: " + item);

            notEmpty.signal();  // Notify waiting dequeuers
        } finally {
            lock.unlock();
        }
    }

    public T dequeue() throws InterruptedException {
        lock.lock();
        try {
            while (size == 0) {
                System.out.println(Thread.currentThread().getName() + " waiting to dequeue...");
                notEmpty.await();  // Wait if queue is empty
            }

            T item = queue[front];
           


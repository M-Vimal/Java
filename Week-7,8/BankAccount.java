public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + " | Balance: " + balance);
        notifyAll();  // Notify waiting threads
    }

    // Synchronized withdrawal method
    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " waiting to withdraw: " + amount);
            try {
                wait();  // Wait until sufficient balance is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + " | Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

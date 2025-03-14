class BankAccount{
	public synchronized void amount(int amount) {
		try {
			for(int i =0;i<5;i++) {	
				System.out.println("Amount paid "+amount);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class LaunchBankAccount {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		Thread t1 = new Thread() {
			public void run() {				
				b1.amount(50);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				b1.amount(100);
			}
		};
		t1.start();
		t2.start();


	}

}

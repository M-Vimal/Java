class Thread1 extends Thread{
	public void run() {
		for (int i=0;i<3;i++) {		
			System.out.println("from thread1");
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for (int i=0;i<3;i++) {		
			System.out.println("from thread2");
		}
		}
}


public class LaunchThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("from main thread");


	}

}

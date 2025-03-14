class OddEven{
	public synchronized void prints(String s) {
		if(s.equals("e")) {
			for(int i=1;i<=10;i++) {
				if(i%2 == 0 ){		
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}	
		}
		else {
			for(int i=1;i<=10;i++) {
				if(i%2 != 0 ){		
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}	
		}
	}
}

public class LaunchOddEvenThread {
	public static void main(String[] args) {
		OddEven oet = new OddEven();
		Thread t1 = new Thread() {
			public void run() {				
				oet.prints("e");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				oet.prints("o");
			}
		};
		t1.start();
		t2.start();
	}

}

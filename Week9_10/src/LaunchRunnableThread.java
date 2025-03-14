
public class LaunchRunnableThread {

	public static void main(String[] args) {
		Runnable square = ()->{
			for (int i =1;i<=5;i++) {
				System.out.println(i*i);
			}
		};
		Thread t1 = new Thread(square);
		t1.start();
	}
}

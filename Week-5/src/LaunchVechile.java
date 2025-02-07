class Vehile{
	protected void start() {
		System.out.println("i'm going to start ");
	}
}

class Car extends Vehile{
	public void start()
	{
		System.out.println("i am car");
		System.out.println("i'm going to start ");

	}
}



public class LaunchVechile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehile c = new Car();
		c.start();

	}

}

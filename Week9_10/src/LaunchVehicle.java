interface Vechile{
	public default void start () {
		System.out.println("vechile is starting");
	};
}

class Car implements Vechile{
	public void start() {
		System.out.println("Car is starting");
	}
}
public class LaunchVehicle {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();

	}

}

import java.util.Scanner;
interface Shape{
	void calculateArea(Scanner scanner);
}
class Circle implements Shape{
	public void  calculateArea(Scanner scanner) {
		System.out.println("enter the radius");
		double radius = scanner.nextDouble();
		System.out.println(3.141592653589793*(radius*radius));
	}
}

class Rectangle implements Shape{
	public void  calculateArea(Scanner scanner) {
		System.out.println("enter length");
		double length = scanner.nextDouble();
		System.out.println("enter breath");
		double breath = scanner.nextDouble();
		System.out.println(length*breath);
	}
}
public class LaunchShape {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Circle c = new Circle();
		c.calculateArea(scanner);
		Rectangle r = new Rectangle();
		r.calculateArea(scanner);
		

	}

}

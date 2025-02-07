import java.util.Scanner;

abstract class Shape{
	abstract void area();
}


class  Circle extends Shape{
	void area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = scanner.nextInt();
		System.out.println("The area of circle is:"+ 3.14*(r*r));	
	}
	
}


class  Rectangle extends Shape{
	void area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length");
		System.out.println("Enter the breath");
		int length = scanner.nextInt();
		int breath = scanner.nextInt();
		System.out.println("The area of Rectangle is:"+length*breath);	
	}
	
}

public class LaunchShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		c.area();
		Rectangle rec = new Rectangle();
		rec.area();

	}

}

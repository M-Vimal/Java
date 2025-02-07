import java.util.Scanner;

abstract class Shape1{
	abstract void area();
}


class  Circle1 extends Shape1{
	void area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = scanner.nextInt();
		System.out.println("The area of circle is:"+ 3.14*(r*r));	
	}
	
}


class  Rectangle1 extends Shape1{
	void area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length");
		System.out.println("Enter the breath");
		int length = scanner.nextInt();
		int breath = scanner.nextInt();
		System.out.println("The area of Rectangle  is:"+length*breath);	
	}
	
}

class AreaOfShape{
	void display(Shape1 shape) {
		shape.area();
		
	}
}

public class LaunchShape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 c = new Circle1();
		Shape1 rec = new Rectangle1();
		AreaOfShape aos = new AreaOfShape();
		aos.display(c);
		aos.display(rec);

	}

}

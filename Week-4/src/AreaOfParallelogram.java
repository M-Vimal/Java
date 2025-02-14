import java.util.Scanner;
public class AreaOfParallelogram {
	
	public static double findArea(double base,double height) {
		return base * height;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Base");
		System.out.println("Enter the height");
		
		double base = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		System.out.println(findArea(base,height));

	}

}

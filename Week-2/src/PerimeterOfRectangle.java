
public class PerimeterOfRectangle {
	public static int calculatePerimeter(int length,int width) {
		int area = (length+width) * 2;
		return area;	
	}
	public static double calculatePerimeter(double length,double width) {
		double area = (length+width) * 2;
		return area;	
	}
	public static double calculatePerimeter(double length,int width) {
		double area = (length+width) * 2;
		return area;	
	}
	public static void main(String[] args) {
		System.out.println(calculatePerimeter(3,3));
		System.out.println(calculatePerimeter(3.3,3.3));
		System.out.println(calculatePerimeter(3.3,3));
		System.out.println(calculatePerimeter(3,3.3));
	}
}

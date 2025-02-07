abstract class Shape2{
	abstract void draw();
}


class Circle3 extends Shape2{
	void draw() {
		System.out.println("I am drawing a circle");
	}
}


class Square extends Shape2{
	void draw() {
		System.out.println("I am drawing a square");
	}
}


public class LaunchShape3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape2 c = new Circle3();
		Shape2 s = new Square();
		
		Shape2[] shapes = {c,s};
		for (int i=0;i<shapes.length;i++) {
			shapes[i].draw();
			
		}

	}

}

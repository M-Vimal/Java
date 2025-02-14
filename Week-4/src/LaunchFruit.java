class Fruit {
	String name;
	String color;
	
	public Fruit(String name,String color) {
		this.name = name;
		this.color = color;
	}
    public void displayInfo() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Color: " + color);
    }
}


class Kiwi extends Fruit{
	String shape;
	String size;
	
	public Kiwi(String name,String color,String shape,String Size) {
		super(name,color);
		this.shape = shape;
		this.shape = size;
		
	}
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
    }
}

class Apple extends Fruit{
	String shape;
	String size;
	public Apple(String name,String color,String shape,String Size) {
		super(name,color);
		this.shape = shape;
		this.shape = size;
	}
	
	
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
    }
}


public class LaunchFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Kiwi kiwi = new Kiwi("Kiwi", "Brown", "Oval", "Small");
        System.out.println("Kiwi Details:");
        kiwi.displayInfo();

        System.out.println();

        // Creating Apple object
        Apple apple = new Apple("Apple", "Red", "Round", "Medium");
        System.out.println("Apple Details:");
        apple.displayInfo();


	}

}

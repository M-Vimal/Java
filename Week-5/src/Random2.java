class A1{
	static void display() {
		System.out.println("i'm  static method from class A");
	}
	
	public void print() {
		System.out.println("i'm instance method from class A");
	}
}


class B1 extends A1{
	public void print() {
		System.out.println("i'm instance method  from class B");
	}
}


public class Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 b1 = new B1();
		b1.display();
		b1.print();

	}

}

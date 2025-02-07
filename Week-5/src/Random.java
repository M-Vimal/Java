class A{
	void display() {
		System.out.println("class A");
	}
}


class B extends A{
	void display() {
		System.out.println("class B");
		super.display();
	}
}


public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new B();
		b.display();

	}

}

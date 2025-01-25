class Books{
	String title;
	int price;
	public Books(){
		this("Unknown Title",0);
		System.out.println(" Default Constructor");	
	}
	
	public Books(String title) {
		this("title",100);
		System.out.println("Single Argument Constructor");
	}
	
	public Books(String title,int price) {
		System.out.println("Double Argument Constructor");
		this.price = price;
		this.title = title;
		
	}
	
	
}
public class LaunchBook {

	public static void main(String[] args) {
		Books b1 = new Books();
		Books b2 = new Books("java");
		Books b3 = new Books("python",200);
				

	}

}


class Book{
	private String author;
	private String title;
	private int price;
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void getTitle() {
		System.out.println(title);
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
}


public class Library {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setTitle("5am club");
		b1.getTitle();	
		int p = b1.getPrice();
		b1.setPrice(200);
		b1.setAuthor("Robin sharma");
		
		System.out.println(p);
	}

}

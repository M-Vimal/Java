import java.io.Externalizable;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;



class Book implements Externalizable{
	String title;
	String author;
	int price;
	
	public Book() {
		this.title = "5am club";
		this.author = "robin sharma";
		this.price = 100;
	}
	
	public void writeExternal(ObjectOutput oo) throws IOException{
		oo.writeObject(title);
		oo.writeObject(author);
		oo.writeInt(price);
	}
	
	public void readExternal(ObjectInput oi) throws IOException,ClassNotFoundException{
		title = (String) oi.readObject();
		author = (String) oi.readObject();
		price = oi.readInt();			
	}
	
	public String toString() {
		return ("title "+ this.title + " author "+this.author + " price " +this.price );
	}
}
public class LaunchBook {

	public static void main(String[] args) {
		Book b = new Book();
		
		//object to store while deserialization
		Book b1 = null;
		//serialization
		try (FileOutputStream fo = new FileOutputStream("TextFiles/serializable.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fo))
		{
			oos.writeObject(b);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//deserialization
		try (FileInputStream fi = new FileInputStream("TextFiles/serializable.txt");
				ObjectInputStream ois = new ObjectInputStream(fi))
		{		
			b1 = (Book) ois.readObject();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("d   " + b1);
		
			

	}

}

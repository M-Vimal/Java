import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;


class Person implements Serializable{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return ("Name " + this.name);
	}
}
public class LaunchSerializeDeserialize {

	public static void main(String[] args) {
		Person p = new Person("vimal",20);
		
		Person p1 = null;
		//serialize
		try(FileOutputStream fo = new FileOutputStream("TextFiles/sede.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fo))
		{
			oos.writeObject(p);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//deserialize
		try(FileInputStream fi = new FileInputStream("TextFiles/sede.txt");
				ObjectInputStream ois = new ObjectInputStream(fi))
		{
			p1 = (Person) ois.readObject();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(p1);

	}

}

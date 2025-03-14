import java.io.Serializable;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;


class Address implements Serializable{
	int no;
	String city;
	String State;
	
	public Address(int no,String city,String state) {
		this.no = no;
		this.city = city;
		this.State = state;
	}
	

}

class Company implements Serializable{
	String company_name;
	Address address;
	
	Address ad = new Address(1,"ramanathapuram","tamilnadu");
	
	public Company() {
		this.address = ad;
		this.company_name = "abc";		
	}
	public String toString() {
		return (this.company_name);
	}
	
}

public class LaunchNestedObject {

	public static void main(String[] args) {
		
		Company c = new Company();	
		Company c1 = null;
		try{
			FileOutputStream fo = new FileOutputStream("TextFiles/serialization-deserialization.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			oos.writeObject(c);
			fo.close();
			oos.close();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try{
			FileInputStream fi = new FileInputStream("TextFiles/serialization-deserialization.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			c1 = (Company)ois.readObject();
			fi.close();
			ois.close();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(c1);

	}

}

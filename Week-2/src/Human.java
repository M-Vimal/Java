class Person{
	String name;
	int age;
	
	public Person() {
		this.name = "vimal";
		this.age = 20;
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class Human {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("luffy",21);
		p1.display();
		p2.display();

	}

}

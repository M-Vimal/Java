abstract class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract public void displayDetails();
}



class Student extends Person{
	String grade;
	public Student(String name,int age,String grade) {
		super(name,age);
		this.grade = grade;
	}
    public void displayDetails() {
        System.out.println("Name: " + super.name); // Accessing name from superclass
        System.out.println("Age: " + super.age);   // Accessing age from superclass
        System.out.println("Grade: " + grade);
    }
	
}


public class LaunchPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s = new Student("vimal",20,"A");
		s.displayDetails();

	}

}

class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
        System.out.println("Name: " +name); 
        System.out.println("Age: " +age);
}
}

class Teacher extends Person{
	String subject;
	public Teacher(String name,int age,String subject) {
		super(name,age);
		this.subject = subject;
	}
    public void displayDetails() {
        System.out.println("Name: " + super.name); // Accessing name from superclass
        System.out.println("Age: " + super.age);   // Accessing age from superclass
        System.out.println("Subject: " + subject);
    }
	
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
	
	public static void display(Person obj) {
		obj.displayDetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s = new Student("ram",17,"A");
		Person t = new Teacher("kumar",32,"science");
		
		display(s);
		display(t);

	}}



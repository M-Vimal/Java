class Animal{
	void sound() {
		System.out.println("i can make sound");
	}
	
}


class Cat extends Animal{
	void sound() {
		System.out.println("Meow meow");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("i can bark");
	}
}




public class LaunchAnimal {
	static void makeSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c = new Cat();
		Animal d = new Dog();
		makeSound(c);
		makeSound(d);
		

	}

}

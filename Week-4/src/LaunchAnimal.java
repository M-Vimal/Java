class Animal{
	public void sound() {
		System.out.println("I can make sound");
	}
}


class Dog extends Animal{
	public void sound() {
		System.out.println("i can make sound. and i am a dog");
	}
}
class Puppy extends Dog{
	public void sound() {
		System.out.println("i can make sound. and i am a puppy");
	}
}



public class LaunchAnimal {
	public static void dis(Animal obj) {
		obj.sound();
		
	}
	public static void main(String[] args) {
		Animal d = new Dog();
		Animal p = new Puppy();
		dis(d);
		dis(p);
	}
	

}

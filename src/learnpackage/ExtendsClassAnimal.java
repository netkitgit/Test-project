package learnpackage;

public class ExtendsClassAnimal {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.name = "Barsik";
		dog.name = "Bobik";
		
		cat.color = "White";
		dog.color = "Black";
		
		cat.walk("Backyard");
		dog.walk("Park");
		
		cat.feed("Milk");
		dog.sit();
		
		System.out.println("Cat name is: " + cat.name);
		System.out.println("Dog name is: " + dog.name);
		
		dog.var = 15;
		
		//dog.weight = 20;
		
		dog.sound();
		cat.sound();
		
	}

}

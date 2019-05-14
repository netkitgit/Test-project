package learnpackage;

public class ClassesAndObjectsClass {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.color = "Black";
		car1.length = 5000;
		car1.height = 2000;
		car1.width = 2000;
		
		car1.addWeight(700);
		car1.drive(120);
		
		car1.addWeight(50);
		car1.drive(120);
		
		Car car2 = new Car();
		car2.color = "White";
		
		Car car3 = new Car();
		car3.color = "Red";
		
		car2.drive(110);
		car3.drive(120);
		
		Car car4 = new Car("Black");
		System.out.println("Car4 color is: " + car4.color);
		
		Car car5 = new Car("Black", 2100, 2000, 5100);
		System.out.println("Car5 color is: " + car5.color);
		System.out.println("Car5 height is: " + car5.height);
		System.out.println("Car5 width is: " + car5.width);
		System.out.println("Car5 lenght is: " + car5.length);
		
		System.out.println(Car.var);
		Car.var = 100;
		System.out.println(car1.var);
		System.out.println(car2.var);
		System.out.println(car3.var);
		
		Car.method();

	}

}

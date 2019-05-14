package learnpackage;

public class Car {
	
	public Car() {
		System.out.println("New car are created!");
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int height, int width, int lenght) {
		this.color = color;
		this.height = height;
		this.width = width;
		this.length = lenght;
	}
	
	static int var = 10;
	static void method() {
		System.out.println("Static method");
	}
	
	int height;
	int width;
	int length;
	int weight = 2000;
	int maxWeight = 2700;
	int speed;
	int maxSpeed = 260;
	String color;
	
	public void addWeight(int weight) {
		this.weight += weight;
		System.out.println("New weight is: " + this.weight);
	}
	
	public void drive(int speed) {
		if (this.weight <= this.maxWeight) {
			this.speed = speed;
			System.out.println("We are driving!");
		} else {
			System.out.println("Cannot drive!");
		}
	}
}

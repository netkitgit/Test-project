package learnpackage;

public class MethodPeregruzka {

	public static void main(String[] args) {
		
		int result;
		
		result = getSum(10, 1);
		System.out.println(result);
		
		result = getSum(10, 2, 2);
		System.out.println(result);
		
		sayHello("Anton");
		sayHello("Vasya", "Vanya");
		
		int[] intArray = {1, 22, 33, 45};
		String name = "Antoha";
		int sum = getSum(intArray, name);
		

	}
	
	static void sayHello(String name) {
		System.out.println();
		System.out.println("Hello " + name);
		System.out.println("It is your program!");
	}
	
	static void sayHello(String name1, String name2) {
		System.out.println();
		System.out.println("Hello " + name1);
		System.out.println("Hello " + name2);
		System.out.println("It is your program!");
	}
	
	static int getSum (int x, int y) {	
		int sum;		
		sum = x + y;		
		return sum;		
	}
	
	static int getSum (int x, int y, int z) {	
		int sum;		
		sum = x + y + z;		
		return sum;		
	}
	
	static int getSum (int[] array, String name) {
		int sum = 0;
		for(int i:array) {
			sum += i;
		}
		
		System.out.println("Hello " + name);
		System.out.println("Sum is: " + sum);
		
		return sum;
	}

}

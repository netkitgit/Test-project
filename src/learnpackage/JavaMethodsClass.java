package learnpackage;

public class JavaMethodsClass {

	public static void main(String[] args) {
		
		int a = 13;
		int b = 3;
		int sum;
		
		sum = getSum(a, b);
		System.out.println(sum);
		sum = getSum(10, 150);
		System.out.println(sum);
		System.out.println(getSum(15, 15));
		
		showSum(10, 5, 3);
		showSum(15, 5, 5);
		
		saySmth();
		sayHello("Vasya");
		String name = "Anton";
		sayHello(name);
		
		showSumToPerson("Grisha", 15, 12, 13);

	}
	
	static int getSum (int x, int y) {	// метод имеет тип int - означает что метод должен ¬≈–Ќ”“№ integer	
		int sum;		
		sum = x + y;		
		return sum;		
	}
	
	static void showSum(int x, int y, int z) {	// void - означает что метод ничего не возвращает, он просто выполн€ет какието действи€
		int sum = x + y + z;
		System.out.println("*** " + sum + " ***");
	}
	
	static void saySmth() {
		System.out.println();
		System.out.println("Hello coder!");
		System.out.println("How are you?");
		System.out.println("I'm running");
	}
	
	static void sayHello(String name) {
		System.out.println();
		System.out.println("Hello " + name);
		System.out.println("It is your program!");
	}
	
	static void showSumToPerson(String name, int x, int y, int z) {
		System.out.println("Start of program!");
		sayHello(name);
		showSum(x, y, z);
		System.out.println("End of program!");
	}

}

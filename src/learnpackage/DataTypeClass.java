package learnpackage;

public class DataTypeClass {

	public static void main(String[] args) {
		
		//ПРИМИТИВНЫЕ ТИПЫ
		//целочисленные
		byte a = 5; // -128 to 127
		short b = -100; // -32768 to 32768
		int c; //
		c = 1000000;
		long d = -616516462;
		
		System.out.println(a);
		System.out.println("short b: " + b);
		System.out.println("int c: " + c);
		System.out.println("long d: " + d);
		
		//вещественные
		double double1 = 133.155;
		System.out.println();
		System.out.println("double double1: " + double1);
		
		float float1 = 150.32f;	
		System.out.println("float float1: " + float1);
		
		//условный тип
		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		boolean boolean3 = 1 + 2 > 0;
		boolean boolean4 = 1 + 2 > 5;
		System.out.println();
		System.out.println(boolean3);
		System.out.println(boolean4);
		
		//строковый тип
		String str = "Hello";
		String str2 = "world!";
		String str3 = str + " " + str2;
		System.out.println();
		System.out.println(str3);
		
		char char1 = 'q';
		System.out.println(char1);
		
	}

}

package learnpackage;

public class CyclesClass {

	public static void main(String[] args) {
		
		System.out.println("Start program");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i * 10);
		}
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("End program");
		
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++) {
			array[i] = i * 2;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Element with index " + i + " is: " + array[i]);
		}
		
		System.out.println("----------------");
		
		//цикл foreach
		for(int element:array) {
			System.out.println(element);
		}
		
		System.out.println("----------------");
		//цикл while
		int k = 0;
		while(k < 10) {
			System.out.println(k);
			k++;
		}
		
		System.out.println("----------------");
		//цикл do while
		int dw = 0;
		do {
			System.out.println("Do while:" + dw); 
			dw++;
		} while (dw < 10);
		

	}

}

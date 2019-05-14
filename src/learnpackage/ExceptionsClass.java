package learnpackage;

public class ExceptionsClass {

	public static void main(String[] args) {
		
		//devide(10, 2);
		
		try {
			devideThrow(10, 0);
		} catch (ArithmeticException e) {			
			e.printStackTrace();
		}
		
	}
	
	static void devide(int x, int y) {
		
		try {
			System.out.println("Result is: " + x/y);
		} catch (ArithmeticException e) {			
			System.out.println("Problem!");
		} finally {
			System.out.println("Finish!");
		}
		
	}
	
	static void devideThrow(int x, int y) throws ArithmeticException{
		
		if(y == 0) {
			throw new  ArithmeticException("Cannot devide by zero!");
		} else {		
			System.out.println("Result is: " + x/y);
		}
	}

}

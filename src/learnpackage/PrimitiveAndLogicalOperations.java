package learnpackage;

public class PrimitiveAndLogicalOperations {

	public static void main(String[] args) {
		
		int a;
		a = 10;
		a = 20;
		System.out.println(a);
		
		int b = a;
		System.out.println(b);
		
		//присваем значение нескольким перменным
		int c, d;
		c = d = b;
		System.out.println(c + " " + d);
		
		a = 13;
		b = 5;
		System.out.println();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //при делении типов int мы получаем int
		
		double e = 15;
		double f = 7;
		System.out.println();
		System.out.println(e / f); //делим вещественные цифры
		
		//получение остатка от деления
		System.out.println(a % b);
		
		a = b + c * d;
		System.out.println(a);
		
		//операции сравнения
		a = 15;
		b = 10;
		System.out.println();
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a - 5 >= b);
		System.out.println(a - 5 <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println();
		System.out.println(a + 10 <= b + 15);
		System.out.println(!(a + 10 <= b + 15));
		System.out.println(!(false));		
		System.out.println();
		
		
		int i = 0;
		//постфиксный инкремент
		i++; // i = i + 1;
		System.out.println(i);
		
		//постфиксный декремент
		i--; // i = i - 1;
		System.out.println(i);
		
		i = 5;
		System.out.println(i++); // 5 (сначала выводится на экран и только потом инкремент)
		System.out.println(i); // 6
		
		//постфиксный инкремент
		i = 3;
		a = i++; //сначала присваиваем переменной а переменную i и только потом увеличиваем i на единицу
		System.out.println(a);
		
		//префиксный инкремент
		i = 3;
		a = ++i; //сначала увеличиваем i на единицу и только потом присваиваем переменной а переменную i 
		System.out.println(a);
		
		//булевые операции
		a = 10;
		b = 20;
		System.out.println(a > b || a < b);
		System.out.println(a > b || b > 30);
		
		System.out.println(a > b && a < b);
		System.out.println(a > 9 && b == 20);
		
		a = 9;
		System.out.println(Math.sqrt(a));
		System.out.println(Math.pow(a, 3));
		System.out.println();
		
		//комбинированные операции
		a = 10;
		a = a + 5;
		System.out.println(a);
		
		a = 10;
		a += 5; // a = a + 5;
		System.out.println(a);
		a -= 5; // a = a - 5;
		System.out.println(a);
		a *= 2; // a = a * 2;
		System.out.println(a);
		a /= 2; // a = a / 2;
		System.out.println(a);
		a %= 3;  // a = a % 3;
		System.out.println(a);
		
	}

}

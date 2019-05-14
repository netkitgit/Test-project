package learnpackage;

public class StringTypeClass {

	public static void main(String[] args) {
		
		String s = "Hello world!";
		System.out.println(s.equals("Hello world!"));
		System.out.println(s.equals("Hello"));
		
		String s2 = "hello";
		System.out.println(s.equals(s2));
		
		s = "text";
		s2 = "TEXT";
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println();
		
		s = "TeXt";
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println();
		
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf("Xt"));
		System.out.println();
		
		s = "Hello World!";
		System.out.println(s.contains("Hello"));
		System.out.println(s.contains("text"));
		System.out.println(s.length());
		System.out.println();
		
		System.out.println(s.startsWith("He"));
		System.out.println(s.startsWith("!"));
		System.out.println(s.endsWith("!"));
		System.out.println(s.endsWith("He"));
		System.out.println();
		
		s = "hello,world";
		String[] array = s.split(",");
		System.out.println(array[0] + "! " + array[1] + "!");
		System.out.println();
		
		String str = "My name is %s, i am %d years old.";
		int age = 30;
		String name  = "Ivan";
		
		System.out.println(String.format(str, name, age));
		System.out.println(String.format(str, "Vasya", 10));
		System.out.println();
		
		String age2 = "30";
		int a = Integer.parseInt(age2);
		System.out.println(a * 3);
		System.out.println();
		
		s = "Hello, world!";
		System.out.println(s.substring(1, 5));
		System.out.println(s.substring(7));
		System.out.println(s.substring(7, s.length() - 2));
		
		
		
		
		
		

	}

}

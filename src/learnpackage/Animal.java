//МОДИФИКАТОРЫ ДОСТУПА
/*public - доступ для ВСЕЙ ПРОГРАММЫ
private - доступ только ВНУТРИ КЛАССА
protected - доступ для КЛАССА и НАСЛЕДНИКОВ
без модификатора - (модификатор package) доступ внутри ПАКЕТА*/

package learnpackage;

public class Animal {
	String color;
	String name;
	
	int var;
	
	public void walk(String place) {
		System.out.println("We are walking here:" + place);
		var = 10;
	}
	
	public void sleep() {
		System.out.println("Zzzzz....");
	}
	
	public void sound() {
		System.out.println("Hello!");
	}
}

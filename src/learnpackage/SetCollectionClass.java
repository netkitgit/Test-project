package learnpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionClass {

	public static void main(String[] args) {
		
		//Set Это коллекция уникальных элементов
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(11);
		set.add(11);
		set.add(11);
		
		System.out.println(set.size());
		
		//У set отсутствует метод get, и мы не  сможем получить элемент по индексу
		
		System.out.println("********************");
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		//foreach
		for(int i : set) {
			System.out.println(i);
		}
		

	}

}

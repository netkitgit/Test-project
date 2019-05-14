package learnpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		
		// тип ключа, тип значения
		Map<Integer, String> map = new HashMap<>();
		
		//ключ всегда должен быть уникальным, значение может повторяться
		map.put(1, "Green");
		map.put(2, "Black");
		map.put(3, "White");
		map.put(10, "Yellow");
		
		System.out.println(map.get(1));
		
		System.out.println(map.size());
		//map.clear();
		System.out.println(map.size());
		
		System.out.println("************************");
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("White"));
		
		System.out.println("************************");
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> iterator = keys.iterator();
		while(iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
		}
		
		System.out.println("************************");
		System.out.println(map.get(2));
		map.put(2, "Grey");
		System.out.println(map.get(2));
		
		System.out.println("************************");
		
		Map<String, String> map2 = new HashMap<>();
		//Надо помнить что ключ должен быть уникальным в MAP
		map2.put("Vasya", "Petechkin");
		map2.put("Antonov", "Artem");
		System.out.println(map2.get("Vasya"));
		

	}

}

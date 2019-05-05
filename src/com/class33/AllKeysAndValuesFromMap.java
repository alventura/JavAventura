package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AllKeysAndValuesFromMap {

	public static void main(String[] args) {
		//Iterator method is not available, it is similar to collections but separate
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");//will override previous duplicate value with the same key
		map.put(4, "D");
		
		System.out.println(map);
		//returns a Set of keys from the map
		System.out.println(map.size());
		
		Set <Integer>keys=map.keySet();
		//how to print all keys
		for(Integer key:keys) {
			System.out.println(key+":"+map.get(key));
		}
		//to return all keys
		System.out.println("Using iterator---------");
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			Integer key=keysIt.next();
			System.out.println(key+":"+map.get(key));
		}
		//How to get All Values
		//return collection of values from a map
		Collection <String> valCol=map.values();
		System.out.println("Using for each loop--------");
		for(String value: valCol) {
			System.out.print(value+", ");
		}
		System.out.println();
		System.out.println("Using iterator-------");
		
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.println(itValues.next()+", ");
		}
	}

}

package com.class34;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {

	public static void main(String[] args) {

		Map<String, Integer> groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread", 2);
		groceryMap.put("Eggs", 12);
		groceryMap.put("Coffee", 2);
		groceryMap.put("Potato", 2);
		groceryMap.put("Cookies", 3);
		
		System.out.println(groceryMap);
		groceryMap.put("Cheese", 1);
		System.out.println(groceryMap.size());
		
		groceryMap.replace("Eggs", 18);
		System.out.println(groceryMap);
		
		groceryMap.remove("Cheese");
		System.out.println(groceryMap);
		
		Set<String> keySet=groceryMap.keySet();
		for(String key:keySet) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
		}
		System.out.println("---for loop directly");
		for(String key:groceryMap.keySet()) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
		}
		
		System.out.println("----Iterator and while loop");
		Iterator<String> keyIt=keySet.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+ ":"+groceryMap.get(key));
		}
		
		//retrieve all values using;
		System.out.println("-----Collection to retrieve all values, and for each loop");
		Collection<Integer> valCollection=groceryMap.values();
		for(Integer value:valCollection) {
			System.out.println(value);
		}
		
		for(Integer value: groceryMap.values()) {
			System.out.println(value);
		}
		
		Iterator<Integer> valueIt=groceryMap.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		} 
		
		//this is the same as below -->Set<Entry<String, Integer>> setOfEntries=groceryMap.entrySet();
	
		System.out.println("Retrieving all keys+values using entrySet()");
	for(Map.Entry<String, Integer> entry: groceryMap.entrySet()){
		String mapValue=entry.getKey()+"=="+entry.getValue();
		System.out.println(mapValue);
	}
	//String="Hello"+1;
	//map-->using entrySet--> Set --> any collection has iterator method--> Iterator
	Iterator<Map.Entry<String,Integer>> it=groceryMap.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry entry=it.next();
		String valueFromMap=entry.getKey()+" and value is "+entry.getValue();
		System.out.println(valueFromMap);
	}

	
	
	
			
	}
}

package com.class34;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map;


public class MapFromArray {

	public static void main(String[] args) {
		
		String [] names= {"Mehmet", "Alvaro", "Miriam", "Silvia","Rose","Joe"};
		
		Map<Integer, String> nameMap=new TreeMap<>();
		
		int a=1;
		
		for(String name:names) {
			nameMap.put(a, name);
			a++;
		}
		System.out.println(nameMap);
		
		Iterator<Map.Entry<Integer, String>> it =nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			String namesFromMap=entry.getKey()+":"+entry.getValue();
			System.out.println(namesFromMap);
		}
		System.out.println("---Using for loop");
		for(Map.Entry<Integer, String> ent:nameMap.entrySet()) {
			String nameValue=ent.getKey()+"="+ent.getValue();
			System.out.println(nameValue);
		}
		
		}
			
		
		
}



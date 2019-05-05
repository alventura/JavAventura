package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCountries {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "USA");
		map.put(2, "UK");
		map.put(3,"China");
		
		Set<Integer>keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key+":"+map.get(key));
		}
		Collection <String> value=map.values();
		for(String val:value) {
			System.out.println(val);
		}

	}

}

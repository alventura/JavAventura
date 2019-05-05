package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Building {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "BOA");
		map.put(2, "Office Depot");
		map.put(3,"HP");
		map.put(4,"HP");
		map.put(5, "Target");
		map.put(6, "UPS");
		map.put(7, "Walmart");
		
		System.out.println("Size of the map is " +map.size());
		map.replace(6, "Fedex");
		System.out.println(map);
		map.remove(7);
		System.out.println(map);
	}

}

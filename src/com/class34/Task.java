package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task {

	public static void main(String [] args) {
	String [] cities= {"DC","Tokyo","Moscow","Buenos Aires"};
	
	
	Map<String, Integer>cityMap=new LinkedHashMap<>();
	
	
	for(String city:cities) {
		//if (city.length()<7) {//optional to put the condition here
		cityMap.put(city,city.length());
		
		}
	System.out.println(cityMap);
	
	Iterator<Map.Entry<String, Integer>>iter=cityMap.entrySet().iterator();
	while(iter.hasNext()) {
		Map.Entry<String,Integer> ent=iter.next();
		if(ent.getValue()>7) {
			iter.remove();
		}
		
	}
	System.out.println(cityMap);
}
}
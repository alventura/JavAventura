package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class KeyAndValuesUsingEntrySet {

	public static void main(String[] args) {
		//create a map to store userDetails
		
		Map<String, String> userDetailsMap=new TreeMap<>();
		userDetailsMap.put("Name", "Alex Smith");
		userDetailsMap.put("Salary", "90000");
		userDetailsMap.put("Department", "IT");
		userDetailsMap.put("Title", "Automation Tester");
		
		System.out.println(userDetailsMap);
		userDetailsMap.entrySet();//returns a set of entries 
		for(Map.Entry<String,String> entry:userDetailsMap.entrySet()) {//non generic is Map.Entry without specifying what type of key/value 
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			System.out.println("Iterator method-----------");
		Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry1=it.next();
			System.out.println(entry1.getKey()+":"+entry1.getValue());
		}
		}
	

}

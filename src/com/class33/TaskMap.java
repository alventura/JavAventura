package com.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TaskMap {

	public static void main(String[] args) {
		Map<Integer,String> bestBuy=new LinkedHashMap<>();
		bestBuy.put(1111, "Laptop");
		bestBuy.put(2222,"MAC");
		bestBuy.put(3333, "Printer");
		System.out.println(bestBuy);
		
		Iterator<Map.Entry<Integer,String>> items=bestBuy.entrySet().iterator();
		while(items.hasNext()) {
		Map.Entry<Integer, String> item=items.next();
		System.out.println(item.getKey()+"="+item.getValue());
	}
	}
}

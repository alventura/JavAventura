package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	public static void main(String[] args) {
	
		HashSet<Integer> hset=new HashSet<>();
		
		hset.add(12);
		hset.add(32);
		hset.add(34);
		
		System.out.println(hset.size());
		System.out.println(hset);
		System.out.println(hset.contains(32));
		//Set Interface does not allow duplicates
		hset.add(12);
		hset.add(32);
		System.out.println(hset.size());
		//to retrieve all values from hashset
		System.out.println("1.using advance for loop");
		for(int num:hset) {
			System.out.println(num);
		}
		System.out.println("2.using iterator");
		Iterator<Integer> iterator=hset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}

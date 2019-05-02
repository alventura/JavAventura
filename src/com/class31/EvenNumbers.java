package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> integers=new ArrayList<>();
		
		for(int a=1;a<=50; a++) {
			integers.add(a);
		}
		Iterator<Integer>even=integers.iterator();
		while(even.hasNext()) {
		int evenNum=even.next();
		if(evenNum%2!=0||evenNum%5==0) {
			even.remove();
		}
		
		}
		System.out.println(integers);
	}

}

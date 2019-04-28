package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValueFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Alvaro");
		names.add("John");
		names.add("Julia");
		names.add("Ron");
		names.add("Gwen");
		
		System.out.println("1 way using for loop");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("----2nd way advanced loop");
		for (Object name:names){
			System.out.println(name);
		}
		System.out.println("---3rd way using iterator");
		Iterator<String> it=names.iterator();
		
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}

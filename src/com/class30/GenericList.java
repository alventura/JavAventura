package com.class30;

import java.util.ArrayList;

public class GenericList {

	public static void main(String[] args) {
		//generic Array that stores only String Object
		ArrayList<String> names=new ArrayList<String>();
		names.add("Alvaro");
		names.add("John");
		names.add("Julia");
		names.add("Ron");
		names.add("Gwen");
		
	   
	   System.out.println(names.isEmpty());
	   System.out.println(names.contains("Alvaro"));
	   System.out.println(names.size());
	   
	   System.out.println("----advanced loop");
		
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println("----for loop");
		for(int a=0;a<names.size();a++) {
			System.out.println(names.get(a));
		}
		
		ArrayList alist=new ArrayList();
		alist.add("String");//String
		alist.add(100);//Integer
		alist.add(100.10);//Double
		alist.add(true);//Boolean
		alist.add('a');//Character (not primitive values, these are objects)
		
		System.out.println("----loop");
		for( Object values: alist) {
			System.out.println(values);
		}
	
		ArrayList<Boolean> booleanArrayList=new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		for(Object val:booleanArrayList) {
			System.out.println(val);
		}
	}
	
}



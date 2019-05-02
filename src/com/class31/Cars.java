package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {

	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<>();	
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Nissan");
		cars.add("BMW");	
		System.out.println(cars);
		
	System.out.println("----iterator");
	Iterator<String> iterator=cars.iterator();	
	while(iterator.hasNext()){
		String car=iterator.next();
		System.out.println(car);
	}
	System.out.println("----for each loop");
	for (Object car: cars) {
		System.out.println(car);
	}
	System.out.println("----using while loop");
	int a=0;
	while(cars.size()>a) {
		String myCar=cars.get(a);
		System.out.println(myCar);
		a++;
	}
	
	
	}
	
	
	

}

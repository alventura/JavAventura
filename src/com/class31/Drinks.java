package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {

	public static void main(String[] args) {
		ArrayList<String> drinks=new ArrayList();
		
		drinks.add("Coffee");
		drinks.add("Soda");
		drinks.add("Water");
		drinks.add("Beer");
		drinks.add("Tequila");
		drinks.add("Red bull");
		
		for (int a=0; a<drinks.size();a++) {
			String drink=drinks.get(a);
			if(drink.endsWith("e")|| drink.endsWith("a")) {
				drinks.set(a,"Water");
			}
		}
		System.out.println(drinks);
		System.out.println(drinks.contains("Water"));
	}
		

}

package com.class3;

public class RelationalOperations {

	public static void main(String[] args) {
	
		
		int a=19;
		int b=50;
		
		boolean result=a>b;
		boolean result1 = a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		if (a>b) {
			System.out.println("a is larger than b"); //will only execute if true
		} else {
			System.out.println("b is lager than a"); //new curly braces must be added to use this code
		}
		
		//declare price and if price is higher than expected amount--> I will not buy it
		
		double shoesPrice= 29.99;
		double allowedPrice=31.99;
		
		if (shoesPrice<=allowedPrice) {
			System.out.println("I am buying those shoes");
		}else {
			System.out.println("I am not buying those shoes");
		}
		

	}

}

package com.class19;

public class ApplicationCalculator {

	public static void main(String[] args) {
	
		//first way without creating an object
		
		System.out.println(Calculator.minimum(10,500,2));
		System.out.println(Calculator.sum(5,4,3));
		System.out.println(Calculator.average(5,4,3));
		System.out.println(Calculator.maximum(46,54,1556));
		
		Calculator calc=new Calculator();//when creating an object
		
		System.out.println(calc.maximum(45, 4, 5));
		

	}

}

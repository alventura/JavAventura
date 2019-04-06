package com.clas17_2;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) { 
		Calculator calc1=new Calculator(); //from the calculator class that is public in a different package

		System.out.println(calc1.mult(56,3));
		
		System.out.println(calc1.add(22,3));
		
		System.out.println(calc1.div(600,3));
		
		System.out.println(calc1.sub(100,3));
	}
}

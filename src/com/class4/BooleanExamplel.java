package com.class4;

public class BooleanExamplel {

	public static void main(String[] args) {
	//declare a boolean variable isRaining, and if it is true --> stay home
		
		boolean isRaining=false;
		boolean result=4<5;//will return true or false value
		
		if (isRaining) {
			System.out.println("Stay home and code");
		}else {
			System.out.println("Take a walk and listen to Java tutorials");
		}

		System.out.println(result);
	}

}

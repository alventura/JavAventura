package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b);// new ArithmeticException gets created
		
		// if person is >18--> issue driver's license else --> throw an exception
		
		//checkAgeEligibility(17);
		//twoNumDiv(10,5);
		//checkUserNameLength("A");
		witdraw(10000);

	}

	public static void checkAgeEligibility(int age) {
		if (age>=18) {
			System.out.println("Congratulations on getting your driver's license");
		}else {
			throw new ArithmeticException("You are not elegilbe to get a driver's license");
		}
		
	}
	
	public static void twoNumDiv(int a, int b){
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We cannot divide by zero");
		}
	}	
	
	public static void checkUserNameLength(String userName) {
		if (userName.length()>3) {
			System.out.println("Username is accepted");
		}else {
			throw new NullPointerException("Username must be longer than 3 characters");
		}
	}
	public static void witdraw(int amount) {
		int balance=10000;
		if(amount>balance) {
			throw new ArithmeticException("Amount too large");
		}else {
			System.out.println("Have a nice day");
		}
	}
}

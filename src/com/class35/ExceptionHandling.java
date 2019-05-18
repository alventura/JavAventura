package com.class35;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Begining of the code");
		//Exception 
		int a=10;
		int b=0;
		
		try {
		System.out.println(a/b);	// object of an exception might be thrown (new InterruptedException)
		System.out.println("Code inside try block");//won't show if there is a mistake in the code inside the "try" blockbm
		}catch (ArithmeticException e) {// object type must match
			System.out.println("Code inside catch block");
		}
		//		InterruptedException e=new InterruptedException();
		System.out.println("The end of the program");
	}

}

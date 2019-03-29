package com.class4;

import java.util.Scanner;//make sure to import scanner

public final class ScannerClass {
	public static void main(String[] args) {
		//take input from user
	
		Scanner scan=new Scanner(System.in);//in is to take info in, opposite of system.out. 
		System.out.println("Enter any number:");
	    int myNumber = scan.nextInt();
	    
	    System.out.println("The number you entered is " + myNumber);
}
}

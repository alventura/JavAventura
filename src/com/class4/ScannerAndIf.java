package com.class4;

import java.util.Scanner;

public class ScannerAndIf {
	//take 2 numbers from user and compare those numbers
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1=scan.nextInt();
		
		System.out.println("Enter second number:");
		num2=scan.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		if (num1>num2) {
			System.out.println(num1 + " is larger than " +num2);
		}else if(num1<num2){
			System.out.println(num1+ " is smaller than " +num2);
		}else {
			System.out.println("done");
		}
	}

}

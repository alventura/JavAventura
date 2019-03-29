package com.class5;

import java.util.Scanner;

public class HwLargestNested {

	public static void main(String[] args) {
		Scanner scan;
		double num1, num2, num3;
		
		
		scan= new Scanner(System.in);
		System.out.println("Please enter first number");
		num1=scan.nextDouble();
		System.out.println("Please enter second number");
		num2=scan.nextDouble();
		System.out.println("Please enter thrid number");
		num3=scan.nextDouble();
		
		if(num1>num2) {
			if(num1>num3){
				System.out.println("first number is the largest");//wont go into this line if first condition is not true
			}else {
					System.out.println("third number is the largest");
			}
		}else{
			if(num2>num3) {
			System.out.println("second number is the largest");
		}else {
			System.out.println("thrid number is the largest");
			}
	}
}
	
}

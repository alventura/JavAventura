package com.class5;

import java.util.Scanner;

public class HwLargestNum1 {

	public static void main(String[] args) {
		Scanner scan;
		int num1;
		int num2;
		int num3;
		
		scan= new Scanner(System.in);
		System.out.println("Please enter first number");
		num1=scan.nextInt();
		System.out.println("Please enter second number");
		num2=scan.nextInt();
		System.out.println("Please enter thrid number");
		num3=scan.nextInt();
		
		if(num1>num2 && num1>num3) {
				System.out.println("first number is the largest");
			}else if(num2>num1 && num2>num3) {
				System.out.println("second number is the largest");		
		}else if(num3>num1 && num3>num1) {
			System.out.println("thrid number is the largest");
		}else {
			System.out.println("wrong input");
		}
	}

}

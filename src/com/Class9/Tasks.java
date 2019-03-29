package com.Class9;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {
		
		Scanner scan;
		int num1,num2;
		int evenSum=0;
		int oddSum=0;
		
		scan=new Scanner(System.in);
		
		System.out.println("Enter a range to perform sum");
		System.out.println("From Number:");
		num1=scan.nextInt();
		System.out.println("To Number:");
		num2=scan.nextInt();
		
		for(int x=num1; x<=num2;x++) {
			if(x%2==0){
				evenSum+=x;
			}else {
				oddSum+=x;
			}
		}
		System.out.println("sum of even "+evenSum);
		System.out.println("sum of odd "+oddSum);
		
		
		
	}
	
	
}

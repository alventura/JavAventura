package com.class6;

import java.util.Scanner;

public class TaskCalculator {

	public static void main(String[] args) {
		Scanner scan;
		double num1, num2;
		char operation;
		double result;
		String error;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter number:");
		num1=scan.nextDouble();
		System.out.println("Please enter operator (+,-,*,/):");
		operation=scan.next().charAt(0);
		System.out.println("Please enter second number:");
		num2=scan.nextDouble();
		


		switch(operation) {
		
		case '+':
			result=(num1+num2);
			break;
		case '-':
			result=(num1-num2);
			break;
		case '/':
			result=(num1/num2);
			break;
		case '*':
			result=(num1*num2);
			break;
		default:
			result=0;
			break;
		}
		System.out.println("The result is " + result);
	}

}

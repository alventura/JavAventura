package com.clas17_3;

import java.util.Scanner;

public class TaskSecretNumber {
	public static void main(String[] args) {
	TaskSecretNumber secretNumber=new TaskSecretNumber();
	
	secretNumber.guessing();
	
		
	}
	void guessing() {
		Scanner scan;
		int num1=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please guess a number from 1-20:");
		num1=scan.nextInt();
		
		int secretNumber= 16;
		
		while(num1<secretNumber) {
			System.out.println("Number is too small");
			System.out.println("Please try again:");
			num1=scan.nextInt();
			if(num1==16) {
				System.out.println("you got it!");
				break;
			}
			
		while(num1>secretNumber) {
			System.out.println("Number is too big");
			System.out.println("Please try again:");
			num1=scan.nextInt();
			if(num1==16) {
				System.out.println("you got it!");
				break;
			}		
		
		}
	}
}

}

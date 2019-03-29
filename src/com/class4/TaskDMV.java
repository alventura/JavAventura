package com.class4;

import java.util.Scanner;

public class TaskDMV {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scan1= new Scanner(System.in);
		System.out.println("Please enter age:");
		age=scan1.nextInt();
		if (age<18) {
			System.out.println("Learner's permit can be issued");
		}else if(age>18) {
			System.out.println("Driver's license can be issued");
		}else {
			System.out.println("Wrong input, try again with a valid age number");
		}

	}

}

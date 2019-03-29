package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		/* 
		 * wirte a program to check work eligibility
		 * if user is younger than 16--->not allowed
		 * otherwise--> allowed. if user is younger than 64-->work-->otherwise play
		 */

		int age=65;
		int eligibleAge=16;
		int retirementAge=64;
		
		if (age<eligibleAge) {
			System.out.println("You are too young, cannot work");
		}else {
			System.out.println("You are eligible to work");
			if (age<retirementAge) {
				System.out.println("Go work hard");
			}else {
				System.out.println("but You should be retired");
			}
		}
		
	}

}

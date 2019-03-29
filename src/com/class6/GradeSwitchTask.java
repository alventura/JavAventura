package com.class6;

import java.util.Scanner;

public class GradeSwitchTask {

	public static void main(String[] args) {
		Scanner scan;
		String grade;
		String performance;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter grade");
		grade=scan.nextLine();
		
		switch(grade) {
		
		case "A":
			performance="excellent";
			break;
		case "B":
			performance="Good";
			break;
		case "C":
			performance="Average";
			break;
		case "D":
			performance="Bad";
			break;
		default:
			performance="unknown";
			break;
		}
		System.out.println("your performance is "+performance);
	}

}

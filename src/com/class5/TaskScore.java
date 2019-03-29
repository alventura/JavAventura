package com.class5;

import java.util.Scanner;

public class TaskScore {

	public static void main(String[] args) {
		
		Scanner scan;
		int quiz;
		int mid;
		int finaltest;
		double score;
		
		
		scan= new Scanner(System.in);
		System.out.println("Please enter quiz grade");
		quiz= scan.nextInt();
		System.out.println("Please enter Mid term grade");
		mid= scan.nextInt();
		System.out.println("Please enter Final test grade");
		finaltest=scan.nextInt();
		
		score=(quiz+mid+finaltest)/3;
		
		if (score>=90 && score<=100) {
			System.out.println("Grade Average: A");
		}else if(score>=70 && score <=90) {
			System.out.println("Grade Average: B");
		}else if(score>=50 && score<=70) {
			System.out.println("Grad Average: C");
		}else if(score<50){
			System.out.println("Grade Average: F");
		}
	
	
	}

}

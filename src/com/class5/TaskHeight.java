package com.class5;

import java.util.Scanner;

public class TaskHeight {
	public static void main(String [] args) {
		Scanner scan;
		double height;
		
		scan= new Scanner(System.in);
		System.out.println("Plese enter height, feet/inches");
		height=scan.nextDouble();
		
		if (height<=5.0) {
			System.out.println("Short");
		}else if(height==5.0 || height<6.0) {
			System.out.println("medium");
		}else if(height >=6){
		System.out.println("tall");
		}
	}
}

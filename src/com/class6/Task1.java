package com.class6;

import java.util.Scanner;

/*write a program that prints out if it is good weather to go for any activity.
 * The weather is good if the temperature is between 40 degrees and 80 degrees and not rain
 * --. we will go hiking unless it is raining--> we will not go hiking
 * If temperature is between 25 and 40 inclusive->snowboarding otherwise we will not go snowboarding
 * if temperature more than 80 & sunny go to the beach otherwise--not go to the beach
 */


public class Task1 {
	public static void main(String [] args) {
		
		Scanner scan;
		int temp;
		boolean rain, snow, sunny;
		String activity;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter temperature");
		temp= scan.nextInt();
		
		if(temp>=40 && temp<80) {
			System.out.println("is it raining?");
			rain=scan.nextBoolean();
			
			if(rain) {
				activity="watching a movie";
			}else {
				activity="go hiking";
			}
			
					
		}else if(temp>=25&&temp<40) {
			System.out.println("is its snowing");
			snow=scan.nextBoolean();
			
			if (snow) {
				activity="snowboarding";
			}else {
				activity="doimg more coding";
			}
			
			
		}else if(temp>=80) {
			System.out.println("Is it sunny");
			sunny=scan.hasNextBoolean();
			
			if (sunny) {
				activity="go to the beach";
			}else {
				activity="coding";
			}
			
			
		}else {
			System.out.println("Please enter other temperature");
			activity="unknown";
		}
		System.out.println("My activity for today is " + activity);
		
	}
}
		
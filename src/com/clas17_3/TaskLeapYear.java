package com.clas17_3;

import java.util.Scanner;

public class TaskLeapYear {
	public static void main(String [] args) {
	TaskLeapYear leap=new TaskLeapYear();
	
	leap.leapOrNot();
		
	}
		/*if year is divisibly by 400---leap
		 * if year is divisiby by 100---not leap
		 * if year is divisible by 4---leap
		 */
		
	void leapOrNot() {	
		  Scanner scan;
	        int year;
	        
	        scan=new Scanner(System.in);
	        
	        for (int i=0; i<10; i++) {
	            
	            System.out.println("Please enter a guessed leap year");
	            year=scan.nextInt();
	            
	            //if year is divisible by 400--> leap year
	            //if year is divisible by 100--> not a leap year
	            //if year is divisible by 4--> a leap year
	            //(year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)--> same thing
	            
	            if (year%400==0) {
	                System.out.println("Year is a leap year");
	                break;
	            }else if (year%4==0 && year%100!=0) {
	                System.out.println("Year is a leap year");
	                break;
	            }else {
	                System.out.println("Year is a NOT leap year");
	            }
	            
	        }
			
		}

		
		
	}


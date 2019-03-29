package com.Class9;

import java.util.Scanner;

public class TaskBuy {
	public static void main(String[] args) {
		
		Scanner scan;
		int price;
		int paid=0;
		int total=0;
		
		scan=new Scanner(System.in);
		System.out.println("Enter price of the item");
		price= scan.nextInt();
		System.out.println("Please pay $"+price);
		System.out.println("Amount paid: ");
		paid=scan.nextInt();
		
		for(int x=price; x<=price; x++) {
			
			for(int y=paid; y<=paid; y++) {
				total=(x-paid);
				if(total!=0) {
					
					System.out.println("Please pay: " + total);
					paid+=scan.nextInt();
					
						}else {
							System.out.println("thank you for shopping!!");
						break;
						}
						
				 }	
					
			 }
			
		 }
		
		
	}




package com.class5;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		/*ask user to enter price and boolean value for sale
		 * based on the sale we will check the price:
		 * if price<20 --> apply discount and give final price
		 * if price is >20 less 100-> apply discount give final price
		 * if the price is >100 less than 500-> apply discount and provide price
		 * 
		 */
		Scanner scan;
		boolean sale;
		int price;
		int discount;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale=scan.nextBoolean();
		if (sale) {
			
	
		System.out.println("Please enter price of item");
		price=scan.nextInt();
		
		if(sale) {
			System.out.println("Let's check discount");
			if (price<20) {
				discount=20;
				finalPrice=price-(price*0.2);
			}else if(price>=20 && price<100) {
				discount=30;
				finalPrice=price-(price*0.3);
			}else if(price>=100 && price<500) {
				discount=50;
				finalPrice=price-(price*0.5);
			}else {
				discount=75;
				finalPrice=price-(price*0.75);
				}
				System.out.println("the final price is " +finalPrice);
		      }else{
					System.out.println("No discount");
				}
		}
		
	}
 
	

}


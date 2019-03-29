package com.class6;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		/*Prompt user to enter their country
		 * based on the country->specify favorite food
		 * 
		 */
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country=scan.nextLine();
		
		switch(country) {
		
		case "USA":
			favoriteFood="Burger";
			break;
		case "Afghanistan":
			favoriteFood="Palau";
			break;
		case "Russia":
			favoriteFood="Pelmeni";
			break;
		case "Italy":
			favoriteFood="Pasta";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
		case "Moroco":
			favoriteFood="Couscous";
			break;
		case"Pakistan":
			favoriteFood="Biryani";
			break;
		default:
			favoriteFood="Unknown";
		
		}
		System.out.println("Your favorite food is "+favoriteFood);
	
	}
	
		
	}
	
	



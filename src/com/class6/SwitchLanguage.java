package com.class6;

import java.util.Scanner;

public class SwitchLanguage {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter country");
		country=scan.nextLine();
		
		switch(country) {
		
		
		case "USA":
			language="English";
			break;
		case "China":
			language="Chinese";
			break;
		case "France":
			language="French";
			break;
		default:
			language="unknown";
			break;
		
		
		}
		System.out.println("You speak "+language);
	}

}

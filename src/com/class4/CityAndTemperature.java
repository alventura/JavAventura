package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {//only one main method for program
	/*
	 * Ask user to enter city and temp in Farenheit
	 * your program should convert F to C
	 * Your program should say :The temperature in the city__ is__
	 */
		String city;
		int temp;
		
		Scanner scan1= new Scanner(System.in);
		System.out.println("Please enter your city:");
		city=scan1.nextLine();
		
		Scanner scan2= new Scanner(System.in);
		System.out.println("Please enter your temperature in farenheit:");
		temp=scan2.nextInt();
		
		System.out.println(city+" "+temp);
		
		int convertTemp=(temp-32)*5/9;
		
		System.out.println("the temperature in the city of " +city+ " is " +convertTemp+ " in celcius");
}
}

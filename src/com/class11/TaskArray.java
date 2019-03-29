package com.class11;

public class TaskArray {
	public static void main(String [] args) {
		
		String[] cars= {"Altima","Sentra","BMW","Mustang"};
		
		for(int a=0; a<4; a++) {
			System.out.println(cars[a]);
		}
		
		System.out.println("Second Way:");
		for(String car:cars) {
			System.out.println(car);
		}
	
		
	}

}

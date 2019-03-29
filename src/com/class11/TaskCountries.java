package com.class11;

public class TaskCountries {

	public static void main(String[] args) {
	
		String[] countries= {"United States","Colombia","Venezuela","France"};
		
		
		for(String capital:countries){
			
			if(capital.equals("United States")) {
			System.out.println("Washington DC");
			}else if(capital.equals("Colombia")) {
				System.out.println("Bogota");
			}else if(capital.equals("Venezuela")) {
				System.out.println("Caracas");
			}else if(capital.equals("France")) {
				System.out.println("Paris");
			}
			}
		String[] countries2= {"United States","Peru","Italy","Japan"};
		
		for (String country:countries2 ) {
			switch(country) {
			case "Japan": 
				System.out.println("Tokyo");
				break;
			case "Peru": 
				System.out.println("Lima");
				break;
			case "Italy": 
				System.out.println("Rome");
				break;
			case "United States": 
				System.out.println("Washington DC");
				break;
			
			}
			
			
		}
	}
	}

	


package com.class16;

public class Phone {
	String brand, model, color, carrier;
	
	public static void main(String [] args) {
		Phone phone1=new Phone();
		
		phone1.brand="Samsung";
		phone1.model="Galaxy";
		phone1.color="black";
		phone1.carrier="Tmobile";
		
		Phone phone2=new Phone();
		
		phone2.brand="Apple";
		phone2.model="Iphone 7";
		phone2.color="gray";
		phone2.carrier="Verizon";

		Phone phone3=new Phone();
		
		phone3.brand="Nokia";
		phone3.model="Nokia 8.1";
		phone3.color="black";
		phone3.carrier="Tmobile";	
	}
	
	void call(){
		System.out.println("Phone can receive and make calls");
	}	
	void texts() {
		System.out.println("Phone can send and receive text messages");
	}	
	void internet() {
		System.out.println("Phone can access the internet");
	}
}

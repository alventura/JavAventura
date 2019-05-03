package com.class32;

public abstract class Insurance {
	String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
class Car extends Insurance{
	
	String carModel;

	public Car(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" Monthly fee based on age and car model");
	
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel membership");
		
	}
	

}

class Pet extends Insurance{
	String petType;

	public Pet(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" quote based on type of pet");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel membership");
		
	}
	}

class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" getting quote for monthly fees");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel membership");
	}}

package com.class34;

public class Car{
	
	public String model;
	public String make;
	
	public Car(String make, String model) {
		this.make =make;
		this.model =model;
	}
	public void printCarDetails() {
		System.out.println("make is "+this.make+" and the model is "+this.model);
	}

	}


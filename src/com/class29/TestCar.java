package com.class29;

public class TestCar {

	public static void main(String[] args) {
		Car sedan=new Sedan();
		Car truck= new Truck();
		
		
		sedan.calculateSalePrice(50000, "Blue");
		truck.calculateSalePrice(100000, "black");
	
	}

}

package com.class29;

public abstract class Car {
	/*
	 * 4. Create a Class Car that would have the following fields: carPrice and color
	 *  and method calculateSalePrice() which should be returning a price of the car.
   Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its
   own implementation of  calculateSalePrice() method in which returned price calculated 
 as following: if weight>2000 then returned ar price should include 10%discount, 
 otherwise 20%discount.
The Sedan class has field as length and also does it is own implementation of
 calculateSalePrice(): if length of sedan is >20 feet then returned car price 
 should include 5%discount, otherwise 10%discount (edited) 
	 */
	
	int regularPrice;
	String color;
	double price;
	
	public void calculateSalePrice(double regularPrice, String color) {
		System.out.println(price);
	
	}
}

class Sedan extends Car{
	
	public void calculateSalePrice(double regularPrice, String color) {
		int length=21;
		
		if(length>20) {
			price=regularPrice-(regularPrice*.05);
		}else if (length<20){
			price=regularPrice-(regularPrice*.10);
	}
	System.out.println("The "+color+" sedan's price after discount is "+ price);
}
}

class Truck extends Car{
	
	public void calculateSalePrice(double regularPrice, String color) {
		int weight=25000;
				
		if(weight>20000) {
			price=regularPrice-(regularPrice*.10);
			}else{
				price=regularPrice-(regularPrice*.2);
			}
		System.out.println("The "+color+" truck's price after discount is "+ price);
  }
}

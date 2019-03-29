package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		double temp=50.;
		double freeze=32;
		if(temp<freeze) {
			System.out.println("Water will freeze with temperatures of " + temp +".");
		}
		else {
			System.out.println("Water will not freeze with temperatures of " + temp + ".");
		}
	}

}

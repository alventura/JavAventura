package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class TestInsurance {

	public static void main(String[] args) {
		Insurance carInsurance=new Car("Car insurance");
		Insurance petInsurance=new Pet("Pet insurance");
		Insurance healthInsurance=new Health("Health Insurance");

		ArrayList<Insurance> insurance=new ArrayList<>();

		insurance.add(carInsurance);
		insurance.add(petInsurance);
		insurance.add(healthInsurance);
		
		for(Insurance insur:insurance) {
			System.out.println(insur.insuranceName);
		}
		
		
		Iterator<Insurance> obj=insurance.iterator();
		while(obj.hasNext()) {
			Insurance ins=obj.next();
			ins.getQuote();
			ins.cancelInsurance();
		}
	}

}

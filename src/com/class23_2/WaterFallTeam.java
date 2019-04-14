package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee {

	public static void main(String [] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary=75000; // can access protected values from different package through inheritance, default cannot be accessed
		wt.test();
		//test is available because it is a protected method
		
	}
	
	
}

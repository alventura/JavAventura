package com.class4;

public class TaskMorgage2 {

	public static void main(String[] args) {
		double rate=4.7;
		int price=300000;
		
		if(rate<4.5) {
			System.out.println("Will buy house");
			if(price<200000) {
				System.out.println("I am Paying cash");
			}else {
				System.out.println("Will take loan");
			}
			}else {
				System.out.println("I will not buy house");
			}
	}

}

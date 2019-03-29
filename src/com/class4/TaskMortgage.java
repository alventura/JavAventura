package com.class4;

import java.util.Scanner;

public class TaskMortgage {

	public static void main(String[] args) {
		double rate=4.5;
		int price=100000;
		

		if(rate>4.5) {
			System.out.println("Will not buy house");
		}else {
				System.out.println("will buy house");
		}if (price>=200000) {
			System.out.println("Apply for loan");
		}else {
			System.out.println("buy cash");
		}
	}
		
}
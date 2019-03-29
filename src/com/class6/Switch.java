package com.class6;

public class Switch {

	public static void main(String[] args) {
		
		int day=2;
		String dayName;
		
	//	if (day==1) {
	//		dayName="Monday";
	//   }else if (day==2) {
	//		dayName="Tuesday";
	//	}else {
	//		dayName="invalid";
	//	}
	
		
		switch (day) {
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
		default:
			dayName="Invalid";
		}
		
		System.out.println("Today is "+dayName);
		
		
	}
	

}

package com.class7;

public class TaskBoolean {

	public static void main(String[] args) {
		int day=1;
		boolean workDay=true;
		
		while (workDay) {
			
			if(day<6) {
				System.out.println("I need a day off");
				day++;
			}
			
		}

	}

}

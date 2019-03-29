package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
	/* 
	 * declare variable for Gpa and having a diploma
	 * if user has diploma->congrats --> if Gpa is higher than 3.5-->hire,
	 * else do not hire
	 */
		double gpa=3.4;
		double expectedGpa=3.5;
		boolean hasDiploma= true;
		
		if(hasDiploma==true) {
			System.out.println("Congrats on diploma!");
			if (gpa>expectedGpa) {
				System.out.println("You hare hired!!");
			}else {
				System.out.println("Unfortunately, we cannot hire you :(");
			}
		}else {
			System.out.println("Please obtain Diploma");
		}
	}

}

package com.class8;

public class ContinueKeyword {
	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			
			if(i==2 || i==3) {//will skip and continue
				continue;
			}
			System.out.println(i);
		}
		 System.out.println("outside");
		 
		 //Print numbers 1-20 but skip divisible but 3
		 
		 for(int i=1; i<=20; i++) {
			 
			 if (i%3==0) {
				 continue;
			 }
			 System.out.println(i);
		 }
		 
		
	}
}

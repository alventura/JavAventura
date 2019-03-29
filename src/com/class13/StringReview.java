package com.class13;

public class StringReview {
	public static void main(String[] args) {
		String reverse="Sunday";
		
		
		for (int a=reverse.length()-1; a>=0;a--) {
			System.out.print(reverse.charAt(a));
	
		}
		
		System.out.println();
		
		String count= "Ventura";
		int size=count.length();
		char character=count.charAt((size)/2);
		boolean odd=size%2!=0;
		
		if(odd) {
			System.out.println(character);
		}
		
	}

}

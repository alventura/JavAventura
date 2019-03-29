package com.practice;

public class PracticeArrayYear {
	public static void main(String[] args) {
		int a=0;
		int b=2010;
		int[] array;
		array= new int[11];
		
		
		do {
			a++;
		    b++;
		 
		 array[a]=b;
		 System.out.println(array[a]);
		} while(a<10);
		 
		
	}

}

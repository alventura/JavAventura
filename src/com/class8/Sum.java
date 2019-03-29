package com.class8;

public class Sum {
	
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);//0,6,15,
		
		int sum2=0;
		
		for(int i=0; i<=100; i+=2) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
	}

}

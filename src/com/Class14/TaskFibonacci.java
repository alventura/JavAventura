package com.Class14;

public class TaskFibonacci {
	public static void main(String[] args) {
	int a=0;
	int b=1;
	int c;
	int run=20;
	
	System.out.print(a+" ");
	
	for(int i=a;i<=run;i++) {
		c=a+b;
		
			System.out.print(c+" ");
			
		a=b;
		b=c;
		
	}
	

	}
}

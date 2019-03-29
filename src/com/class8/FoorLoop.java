package com.class8;

public class FoorLoop {

	public static void main(String[] args) {
		
		for(int a=1;a<=100; a++){
			System.out.println(a);
		}
		
		for(int x=100; x>=1; x--) {
			System.out.println(x);
		}
	
		for(int y=1; y<=20; y+=2) {
			System.out.println(y);
		}
		for(int y=1; y<=20; y++) {
			if(y%2!=0) {
				System.out.println(y+" alternate way");
			}
		}
		
		for(int b=20; b>=1; b-=2) {
				System.out.println(b);
		}
		for(int b=20; b>=1; b--) {
			if(b%2==0) {System.out.println(b+" alternate way");
		}
		}
		for(int c=20; c<=50; c+=2) {
			System.out.println(c);
		}
		for(int c=20; c<=50; c++) {
			if(c%2==0) {System.out.println(c+" alternate way");
			}
		}
		
		for(int d=20; d<=50; d++) {
			if (d%2!=0) {
			System.out.println(d);
			}	
		}
	//missing the last alternate one
		
	}

}
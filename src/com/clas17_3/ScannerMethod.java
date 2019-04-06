package com.clas17_3;

import java.util.Scanner;

 class ScannerMethod {//shouldnt make classes private
	public static void main(String [] args){
		
	ScannerMethod obj= new ScannerMethod();
	
	Scanner scan= new Scanner(System.in);
	
	int a= scan.nextInt();
	int b= scan.nextInt();
	obj.sum(a, b);
	
	int c= scan.nextInt();
	int d=scan.nextInt();
	System.out.println(obj.subtract(c,d));
		
	}
	void sum(int x, int y) {
		System.out.println(x+y);
		}
	int subtract(int a, int b) {
				return (a-b);
}
}

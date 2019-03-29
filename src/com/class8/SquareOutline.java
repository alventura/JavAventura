package com.class8;

public class SquareOutline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=4; i++) {
			
			for (int x=1; x<=6; x++) {
				
				if(i==1 || i==4 || x==1 || x==6) {
					System.out.print("X");
					
				}else{
					System.out.print(" ");
				 }
					
				}
				
				System.out.println();
			}
		}
	}



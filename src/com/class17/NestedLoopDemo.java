package com.class17;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		for ( int i=1; i<=3;i++) {
			
			for (int y=1; y<=3; y++) {//the inner loop runs entirely before re-checking the outer loop's condition
				System.out.println(i+" "+y);
				
			}
			
		}

	}

}

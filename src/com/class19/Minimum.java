package com.class19;

public class Minimum {

	public static void main(String[] args) {
		

	}
static int minOfValues(int[] x) {
	int min=0;
	
	for(int y: x) {
		if(y<min) {
			min=y;
		}
	
	}
	return min;
	

	
}
}

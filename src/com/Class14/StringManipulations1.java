package com.Class14;

public class StringManipulations1 {

	public static void main(String[] args) {
		
		String str="saturday";
		
		char [] array=str.toCharArray();
		
		for (char c:array) {
			System.out.println(c);
			
			}
		System.out.println("Printing in reverse");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
			
		}

	}

}

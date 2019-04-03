package com.Class14;

public class StringSplit {

	public static void main(String[] args) {
		String str="Welcome Syntax Students";
		String [] array=str.split(" "); //will cut out the specified characters and split the string from that point
		//you can find out how many words if you take out the space from the string
		System.out.println("The length of the array is "+array.length);
		
		System.out.println(array.length);
		
		for(String substring:array) {
			System.out.println(substring);
		}
		System.out.println("----------------");
		for(int z=0;z<array.length;z++) {
			System.out.println(array[z]);
			
		}

	}

}

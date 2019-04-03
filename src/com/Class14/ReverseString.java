package com.Class14;

public class ReverseString {

	public static void main(String[] args) {
		String original="Today is Java Class";
		String reverse="";
		char[] array=original.toCharArray();
		
		// 3 using substring()
				String reverse3="";
				//System.out.println(original.length());
				for (int i=original.length(); i>0; i--) {
					reverse3=reverse3+original.substring(i-1, i);
				}
				System.out.println("Reversed String is: "+reverse3);
	




		
		}

	}



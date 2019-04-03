package com.Class14;

import java.util.Scanner;

public class InterviewQuestionsPartTwo {

	public static void main(String[] args) {
		Scanner scan;
		scan=new Scanner(System.in);
		String word;
		
		System.out.println("Please enter a word to check:");
		word=scan.nextLine();
		char[] letters=word.toCharArray();
		int size=letters.length-1;
		String backwards="";
		
		for(int z=size;z>=0;z--) { 
			backwards+=letters[z];
			}
		if(!backwards.equalsIgnoreCase(word)) {
			System.out.println("Not Palindrome, "+word+" reads "+backwards+" when backwards");
		}else {
			System.out.println("Palindrome!! "+word+" reads "+backwards+" when backwards");
		}
		
System.out.println("------task 7--------");




	}

}

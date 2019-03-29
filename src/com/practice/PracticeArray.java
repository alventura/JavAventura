package com.practice;

import java.util.Scanner;

public class PracticeArray {
	public static void main(String [] args) {

		 Scanner scan;
		    String day;
		    String [] array;
		    
		    scan=new Scanner(System.in);
		    array=new String [7];
		    for(int a=0;a<=6;a++){
		    System.out.println("Please enter day "+(a+1)+" of the week");
		 
		    array[a]=scan.nextLine();
		    }

		    for (int b=0; b<7; b++){
		        System.out.println(array[b]);
		       }
	}
}
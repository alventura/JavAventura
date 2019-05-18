package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);

		System.out.println("Enter a number from 1-10");
		
		
		try{
			int input=a.nextInt();
	}catch(InputMismatchException b){
		System.out.println("not a number, please Enter a number");

		}
		
	}

}

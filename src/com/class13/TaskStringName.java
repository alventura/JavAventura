package com.class13;

import java.util.Scanner;

public class TaskStringName {

	public static void main(String[] args) {
		Scanner scan;
		scan=new Scanner(System.in);
		String name1, name2,gender;
		String suggestion="";
		
		
		System.out.println("Please enter Mom's first name:");
		name1=scan.nextLine();
		
		System.out.println("Please enter Dad's first name:");
		name2=scan.nextLine();
		
		System.out.println("Boy or Girl?");
		gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("Boy")) {
			suggestion=(name1.substring(0,2)+name2.substring(name2.length()/2,name2.length()));
		}else if(gender.equalsIgnoreCase("Girl")) {
			suggestion=(name2.substring(0,2)+name1.substring(name1.length()/2,name1.length()));
		}
		System.out.println("You could name the baby: "+suggestion+"...?");
	}

}

package com.class12;

import java.util.Scanner;

public class TaskUserPassword {
	public static void main(String[]args) {
		Scanner scan;
		scan=new Scanner(System.in);
		
		System.out.println("Please enter username:");
		String username=scan.nextLine();
		
		System.out.println("Please enter password:");
		String password=scan.nextLine();
		
	 	if(password.isEmpty() || username.isEmpty()) {
			System.out.println("Username or Password cannot be empty!");
		}else if(password.length()<8) {
				System.out.println("Password cannot be less than 8 characters!");
			}else if(password.contains(username)) {
					System.out.println("Password cannot contain username!");
			}else {
				System.out.println("Confirm Password");
				String confirm=scan.nextLine();
				if(confirm.contentEquals(password)) {
					String confirmed=confirm;
			System.out.println("Your password and username have been created!");
				}else {System.out.println("try again");
		
			}
			}
	
	}
	
	
}

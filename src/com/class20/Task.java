package com.class20;

public class Task {

	public static void main(String[] args) {
		Task email=new Task();
		
		System.out.println(email.createEmail("Ventura","Alvaro","gmail.com"));

	}
static String createEmail(String lastName,String firstName, String emailType) {
	String email=lastName.substring(0,2)+firstName+"@"+emailType;
	return email.toLowerCase();
}



}

package com.class19;

public class Human {
	static String eyeColor="Brown";//
	String gender="male"; //instance variables, we create an object and every object will get a copy of it
	int height=6;
	int weight=180;

	String programmingLanguage= "Java"; //will be an instance variable
	
	void speak() {
		String language ="English"; //not available outside this method so it is local
		System.out.println("Human can speak "+language);
	}
	void coding() {
		System.out.println("Systanx students can code");
	}

	
}

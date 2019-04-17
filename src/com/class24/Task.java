package com.class24;

public class Task {
	
	public static void method() {
		System.out.println("Overloading");
	}
	public static void method(int a) {
		System.out.println("Overloading "+a);
	}

	public static void method(String a) {
		System.out.println("Overloading "+a);
	}
	
	public static void main(String [] args) {
		
		Task two=new Task();
		
		two.method();
		two.method(2);
		two.method("three");
	}
}

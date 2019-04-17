package com.class24;

public class Task_3 {

	private void method() {
		System.out.println("overloaded");
	}
	private void method(int a) {
		System.out.println("overloaded "+a);
	}
	private void method(String a) {
		System.out.println("overloaded "+a);
	}
	
	public static void main(String[] args) {
		Task_3 obj=new Task_3();
		
		obj.method();
		obj.method(2);
		obj.method("three");

	}

}

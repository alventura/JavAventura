package com.class23;

public class Employee {
	public static String department="IT";
	//protected, default could be accessed by the child classes but not private variables or methods
	public int salary;
	protected int salary1;
	
	
	public void getPaid() {
		System.out.println("Employee get's paid " + salary);
}
	
	public static void work() {
		System.out.println("Employee works in "+department+" department");
	}
	
	void test1() {
		System.out.println("I am a default method");
	}
	
	protected void test() {
		System.out.println("I am a protected method");
	}
}

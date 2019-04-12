package com.class21;

public class Employee {

	public int eID,salary;
	public static String CEO= "Sumair";
	
	public static void main(String [] args) {
		
		Employee one=new Employee();
		Employee two=new Employee();
		
		one.eID=1212;
		one.salary=800;
		one.eeInfo();
		
		two.eID=2222;
		two.salary=700;
		two.eeInfo();
		
	}
public void eeInfo() {
	System.out.println("Employee number "+eID+" makes "+salary+" per week, and his CEO is "+CEO);
}
	
}

package com.class34;

public class Person {

		private String name,lastName;
		private  int age, salary;
		
	public Person(String name, String lastName, int age, int salary) {
		super();
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
		public void printUserDetails () {
			System.out.println("Name and last name are "+this.name+" "+this.lastName+", age is "+this.age+" and Salary is "+this.salary);
		}
	}



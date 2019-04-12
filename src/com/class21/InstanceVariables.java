package com.class21;

public class InstanceVariables {

	String name="John"; //Instance or global, they can have access modifiers, locals cannot.
	
	public static void main(String[] args) {
	
		String name="Anna"; //local
		System.out.println(name);
		System.out.println("---Changing value of local variable---");
		name="Olga";
		System.out.println(name);
		//creating 1 object  
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name+" -- from instance variable");
		System.out.println("---Changing value of instance variable---");
		obj.name="Jack";
		System.out.println(obj.name);
		//creating second object
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
		
	}

}

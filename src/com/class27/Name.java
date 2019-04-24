package com.class27;

public class Name {
	public String name;
	public long number;
	
	
	public Name(String name,  long number){
		this.name=name;
		this.number=number;
}
	
}

class UserInfo extends Name{
	public String address;
	
	public UserInfo(String name, long number, String address){
	super(name, number);
	this.address=address;
	}
	
	public void userDetails() {
		System.out.println("user name is "+name+" and phone number is "+number+" and the address is "+address);
	}
}
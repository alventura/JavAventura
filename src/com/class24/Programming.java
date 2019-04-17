package com.class24;

public class Programming {
	
	public static String str="Programming languages";
	
	Programming(){
		System.out.println("I love "+str);
	}
	
	Programming(String str){
		System.out.println("I love "+str);
	}
	
	public static void main(String [] args) {
		Programming obj1=new Programming();
		Programming obj=new Programming("Java");
	}
	
	

}

package com.class19;
public class Animal {
	String breed;
	int age, weight;
	
	boolean canBark(String breed) {
		return true;
		}
	boolean isWild(String breed) { //if static, then it would belong to the class/ if instance it belongs to every object
		System.out.println("a " +breed+" is not wild");
		return false;
			
		}
	
	public static void main(String[] args) {
		

	}

}

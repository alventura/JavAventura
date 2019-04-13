package com.class22;

public class Child2 extends Parent {
	String hairType="Wavy";
	
	public static void main(String[] args) {
		
		Child2 childObject2=new Child2();
		System.out.println("Child 2 eye color "+childObject2.eyeColor);
		System.out.println("Child 2 hair color "+childObject2.hairColor);
		System.out.println("Child 2 has "+childObject2.nose+" nose");
		childObject2.sing();
		childObject2.draw();
		
		Parent parentObject=new Parent();
		//parentObject.hairType --> not accessible in Parent Class
		//parentObject.playTennis()--> not accessible in Parent Class
		
	}
	public void draw() {
		System.out.println("Child 2 can draw");
	
}
}
package com.class27;

public class Shape {
	int radius;
	Shape(int radius){}
	
	public static void main(String[] args) {
		Circle obj=new Circle();
		

	}
}

class Circle extends Shape{
	Circle(){
		super(15);
		System.out.println(this.radius*(3.14*3.14));
	}
}
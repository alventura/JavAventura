package com.class23;

public class CalculateTask {

	public void area(int a, int b) {
		System.out.println("Calculating area of a rectangle");
		System.out.println(a*b);
	}
	public void area(double a) {
		System.out.println("Calculating area of a square");
		System.out.println(a*a);
	}
	public void area(int a) {
		System.out.println("Calculating area of a cube");
		System.out.println(6*(a*a));
	}
}
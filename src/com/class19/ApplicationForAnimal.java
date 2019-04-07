package com.class19;

import java.lang.reflect.Array;

public class ApplicationForAnimal {

	public static void main(String[] args) {
		Animal dog= new Animal();
		Animal cat= new Animal();
		Animal bulldog= new Animal();
		
		dog.breed="Labrador";
		dog.age=3;
		dog.weight=27;
		System.out.println(dog.canBark(dog.breed));
		System.out.println(dog.isWild(dog.breed));
		
		cat.breed="Main Coon";
		cat.age=2;
		cat.weight=8;
		System.out.println(!cat.canBark(cat.breed));
		System.out.println(cat.isWild(cat.breed));
		
		
		bulldog.breed="Bulldog";
		bulldog.age=5;
		bulldog.weight=60;
		System.out.println(bulldog.canBark(bulldog.breed));
		System.out.println(bulldog.isWild(bulldog.breed));
		
		int[] a= {0,1,2,3,4,5,30};
		
		System.out.println(Minimum.minOfValues(a));
		
		int [] array = {25,14,56,15,36,56,77,18,29,49};
		System.out.println(ApplicationForAnimal.max(array));
		
		System.out.println(ApplicationForAnimal.minValue(array));
	}

	static int max(int[] x) {
		int max1=0;
		
		for(int y: x) {
			if(y>max1) {
				max1=y;
			}
		
		}
		return max1;
}
	static int minValue(int[] x) {
		int min1=100;
		for(int y: x) {
			if(y<min1) {
			min1=y;	
		}
		}
		return min1;
}
}
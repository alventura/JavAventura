package com.class11;

public class TaskArraysStrings {
	public static void main(String[]args) {
		String [][] cars= {
				{"GMC","Ford","Dodge","Buick"},
				{"Mercedes","ValksWagon","BMW","Audi"},
				{"Kia","Hyundai","Daewoo"},
				{"Maserati","Lamborghini","Ferrari","Alfa Romero"},
				};
		
		for(int a=0;a<cars.length;a++) {
			
			for(int b=0; b<cars[a].length;b++) {
				System.out.print("-"+cars[a][b]+"");
			}
			System.out.println("-");
			
		}
		
	}
	
	
}

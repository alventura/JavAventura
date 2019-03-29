package com.class12;

public class ForEachIn2D {
	public static void main(String[]args) {
		String[] [] groceryList={
			{"Apples","Strawberries","Bananas","Grapes"},
			{"Carrots","Potatoes","Lettuce","Cauliflower"},
			{"Milk","Cheese","Yogurt","Butter"},
			
		};
		
		for(String[] list:groceryList) {
			for(String item:list) {
				System.out.print(item+" ");
			}System.out.println();
		}
		System.out.println("Second Way-------");
		for(int a=0; a<groceryList.length;a++) {
			for(int b=0;b<groceryList[a].length;b++) {
				System.out.print(groceryList[a][b]+" ");
			}System.out.println();
		}
		
	}
	
	

}

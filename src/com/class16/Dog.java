package com.class16;

public class Dog {
		String color, breed, size, temper;
		
		public static void main(String [] args) {
			Dog dog1=new Dog();
			
			dog1.color="black and white";
			dog1.breed="Husky";
			dog1.size="medium size";
			dog1.temper="Very active";
			
			Dog dog2=new Dog();
			
			dog2.color="Blonde";
			dog2.breed="Labrador";
			dog2.size="medium size";
			dog2.temper="Very calm";
			

			Dog dog3=new Dog();
			
			dog3.color="brown and white";
			dog3.breed="Bulldog";
			dog3.size="medium size";
			dog3.temper="Mild temper";
				
		}
		
		void bark(){
			System.out.println("Dog can bark");
		}	
		void bite() {
			System.out.println("Dog can bite if provoked");
		}	
		void howl() {
			System.out.println("Dog can howl");
}
}
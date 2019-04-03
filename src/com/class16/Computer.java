package com.class16;

public class Computer {
	boolean mouse, keyboard;
	String  os;
	int ram,screen;
	
	public static void main(String [] args) {
		
		Computer comp1=new Computer();
		
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen=4;
		comp1.ram=8;
		comp1.os="Windows";
		
		Computer comp2=new Computer();
		
		comp2.mouse=true;
		comp2.keyboard=true;
		comp2.screen=4;
		comp2.ram=6;
		comp2.os="Mac OS";	
	}

	void watchMovie() {
		System.out.println("We can watch a movie on a computer");
	}
	
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer");
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer");
	}
}

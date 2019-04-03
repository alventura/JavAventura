package com.Class14;

public class TasksClass14 {

	public static void main(String[] args) {
		String sentence="This is a sentence.";
		String[] array =sentence.split(" ");
		
		for(String words:array){
			System.out.println(words);
		}
		System.out.println("---Task 2---");
		sentence= "This&is&a#sentence";
		String sentence2= sentence.replaceAll("[^A-Z a-z]","");
		System.out.println(sentence2);
		System.out.println(sentence2.length());
		
		System.out.println("---Task 3---");

		String a="Is it Saturday/ Is it raining/ Do we have a Java Class today/";
		String [] array1=a.split("/ ");
		System.out.println(array1.length);		
		

}
}
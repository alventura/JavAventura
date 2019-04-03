package com.class15;

import java.util.Scanner;

public abstract class TaskInterviewQuestions {

	public static void main(String[] args) {
		//Swap 2 variables and 2 strings without temporary variable
		int num1=100;
		int num2=200;
		
		
		num1=num1+num2;//300
		num2=num1-num2;//300-200=100
		num1=num1-num2;//300-100=200
		
		System.out.println(num1);
	
		System.out.println(num2);
		
		
		String sentence1="Inside sentence1 varible";
		String sentence2="Inside sentence2 variable";
		
		sentence1 = sentence1 + sentence2;
		sentence2= sentence1.substring(0, (sentence1.length() - sentence2.length()));
		sentence1 = sentence1.substring(sentence2.length());
		
		
		System.out.println("sentence 1 is "+sentence1);
		
		System.out.println("sentence 2 is"+sentence2);
		
		
		
System.out.println("-----Question 2------");

int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};


int largetst = numbers[0];

for(int i=1; i< numbers.length; i++)
{
	if(numbers[i] > largetst)
		largetst = numbers[i];
}


System.out.println("Largest Number is : " + largetst);

String str="tax is a substring of syntax";
// ask Java to separate the string every time that there is a Space and you put it into an array by using split()

String [] array= str.split(" ");

/*the new array will have the contents of your variable str, it will start taking the contents until it finds a space, when 
 it finds the space it will cut and put it inside the array*/


//Just so we can see kind of what the array will look like I put this code below
String word="";
for(int a=0;a<array.length;a++) {
	 word+=array[a]+",";
	 	 
}
System.out.print("array{"+word+"} there are "+array.length+" words");//this is what  array=str.split(" ") does
//then you just do array.length to count how many items are inside the array when you took out spaces.


	
 }
	
}



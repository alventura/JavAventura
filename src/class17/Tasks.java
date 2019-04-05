package class17;

import java.util.Scanner;

public class Tasks {
	
	public static void main(String [] args) {
		Tasks num= new Tasks();
		
		num.largestNumber(4,2);
		num.evenOrnot(2178);
		
		Tasks word=new Tasks();
		
		word.palindromeOrnot();	
	}
	void largestNumber(int a, int b) {
		if(a>b) {
			System.out.println("The largest number is "+a);
		}else {
			System.out.println("The largest number is "+b);
		}
	}
	void evenOrnot(int a) {
		if(a%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}
	
	void palindromeOrnot() {
		System.out.println("Enter word to check if palindrome: ");
		Scanner scan;
		scan= new Scanner(System.in);
		String input=scan.nextLine();
		char [] wordChecking= input.toCharArray();
		String backwards="";
		for(int i=input.length()-1; i>=0; i--) {
			backwards+=wordChecking[i];
		}if(backwards.equalsIgnoreCase(input)){
			System.out.println(input+" reads " + backwards+" when backwards so it is a palindrome word");
		}else {
			System.out.println(input+" reads "+backwards+" when backwards so it is not a palindrome word");
		}
		
	}
	
	
}

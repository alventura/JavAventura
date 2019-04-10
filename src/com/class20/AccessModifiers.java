package com.class20;

public class AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers word= new AccessModifiers();
		
		System.out.println(word.reverse("hello"));
		System.out.println(word.palindrome("Kayak"));
		
		String [] array=word.words("Today is Tuesday already");
		
		for(String x:array) {
			System.out.println(x);
		}
		
	}
	
	 protected String reverse(String str) {
		int size=str.length();
		String letters="";
		for(int y=size-1; y>=0;y--) {
			letters+=str.charAt(y);
		}
		return letters;
	}
	 public String palindrome(String str) {
		 char [] backwards= str.toCharArray();
		 int size= backwards.length;
		 boolean palin=true;
		 String newWord="";
		 String result="";
		 for(int y=size-1;y>=0; y--) {
			 newWord+=backwards[y];
		 }
		 if(!newWord.equalsIgnoreCase(str)) {
				 palin=false;
				  result=palin+" not palindrome";
			}else{
				palin=true;
				result=palin+" it is palindrome";
		 }
	 
		 return result;
}
	 private String [] words(String sentence) {
		 String [] array=sentence.split(" ");
		 
		 return array;
	 }
	 
	 
}
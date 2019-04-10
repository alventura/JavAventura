package com.class20;

public class Student {

	public static void main(String[] args) {
		Student person= new Student();
		
		System.out.println(person.grade(92));

	}

	String grade(int score) {
		String letterGrade="";
		if(score>90) {
			letterGrade="Grade is A";
		}else if(score>80) {
			letterGrade="Grade is B";
		}else if(score>70) {
			letterGrade="Grade is C";
		}else if(score>50) {
			letterGrade="Grade is D";
		}else {
			letterGrade="E";
		}
		return letterGrade;
	}
}

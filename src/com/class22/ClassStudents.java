package com.class22;

public class ClassStudents {
		public static String studentName;
		
	public static void main(String[] args) {
		TaskConstructor privateConstructor2=new TaskConstructor();
		
		ClassStudents student1=new ClassStudents();
		ClassStudents student2=new ClassStudents();
		ClassStudents student3=new ClassStudents();
		ClassStudents student4=new ClassStudents();
		ClassStudents student5=new ClassStudents();
		
		student1.grades("Robert", 95, 85, 91);

	}
	public void grades(String studentName,int a,int b,int c) {
	 System.out.println(studentName+ " has an average grade of "+(a+b+c)/3);
		
	}

}

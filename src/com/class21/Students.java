package com.class21;

public class Students {
	
	String studentName;
	int studentID;
	public static int numberOfStudents;
	
	public static void main(String [] args) {
		Students person1=new Students();
		Students person2=new Students();
		Students person3=new Students();
		
		person1.studentName="Robert";
		person1.studentID=1245;
		Students.numberOfStudents++;
		
		person2.studentName="Mary";
		person2.studentID=1246;
		Students.numberOfStudents++;
		
		person3.studentName="Mariah";
		person3.studentID=1247;
		Students.numberOfStudents++;
		
		System.out.println("Total number of students: "+Students.numberOfStudents);
		
		
		
	}

}

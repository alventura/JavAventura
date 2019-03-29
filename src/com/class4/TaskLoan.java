package com.class4;

import java.util.Scanner;

public class TaskLoan {
	public static void main(String[] args) {
	int loan;
	
	Scanner scan1= new Scanner(System.in);
	System.out.println("Enter loan amout");
	loan=scan1.nextInt();
	
	if (loan<200000) {
		System.out.println("Loan request is whithin allowed amount");
	}else {
		System.out.println("Loan request exceeds allowed amount");
	}
}
}

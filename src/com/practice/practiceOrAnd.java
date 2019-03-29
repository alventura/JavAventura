package com.practice;

import java.util.Scanner;

class Main {
	  public static void main(String [] args){
	    Scanner scan;
	    boolean loan;
	    int creditScore;
	    String eligibility;
	    
	    scan=new Scanner(System.in);
	    System.out.println("Do you need a loan?");
	    loan=scan.nextBoolean();
	    
	    if (loan){
	    System.out.println("What is your credit score?");
	    creditScore=scan.nextInt();
	    
	    if (creditScore<600){
	      eligibility="Not eligible";
	      }else if(creditScore>=600 && creditScore<=700){
	      eligibility="Maybe eligible";
	     }else if(creditScore>=701 && creditScore<=800){
	      eligibility="Eligible";
	      }else{
	      eligibility="Definitely eligible";
	      }
	        
	    }else{
	      eligibility= "Unknown";
	    }
	    System.out.println("The eligibility is "+ eligibility);
	      
	   }
	  } 
	   

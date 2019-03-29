package com.class11;

public class TaskNames {
	public static void main(String[]args) {
		String[][] names= {
				{"Mr. ","Mrs. ","Miss ","Ms. "},
				{"Smith","Jordan","Jackson","Obama"},					
		};
		System.out.println(names[0][1]+names[1][0]);
		System.out.println(names[0][0]+names[1][3]);
		System.out.println(names[0][3]+names[1][2]);
				
		
		String[][]gradeNames= {
				{"Sofia ","Carlos","Robert", "Julia"},
				{"A","B","A","B"},
				
		};
		
		for(int a=0;a<4;a++) {
			if(gradeNames[1][a].equals("A")) {
				System.out.println("Students who scored an A: "+gradeNames[0][0]+" "+gradeNames[0][2]);
			}else if(gradeNames[1][a].equals("B")){
				System.out.println("Students who scored a B: "+gradeNames[0][1]+" "+gradeNames[0][3]);
				break;
			}
		  }
		
		}
		
	
	}	



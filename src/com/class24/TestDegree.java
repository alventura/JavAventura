package com.class24;

public class TestDegree {

	public static void main(String[] args) {
		Degree parent=new Degree();
		Undergraduate child1=new Undergraduate();
		Postgraduate child2=new Postgraduate();
		
		parent.getDegree();
		child1.getDegree();
		child2.getDegree();
		
		
	}

}

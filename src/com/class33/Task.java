package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task {

	public static void main(String[] args) {
		
		HashSet<String> aList=new HashSet<>();//to remove duplicates, the easiest way is to convert List to Hashset
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		System.out.println(aList);
	}

}

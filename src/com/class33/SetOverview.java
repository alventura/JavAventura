package com.class33;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {
		
		Set<String> classDays=new TreeSet<>();//HashSet has no order, but LinkedHasSet does//TreeSet does alphabetical order
		classDays.add("Tuesday");
		classDays.add("Wednedday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		System.out.println("----------------");
		for(String days:classDays) {
			System.out.println(days);
		}
		
		
	}
}

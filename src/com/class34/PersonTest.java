package com.class34;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {
		Map<Integer, Person> personMap=new TreeMap<>();
		personMap.put(001,new Person("Ryan","Smith", 30,80000) );
		personMap.put(002,new Person("Al","Ven", 20,90000) );
		personMap.put(003,new Person("Rose","White", 40,70000) );
		
		Collection<Person>personVal=personMap.values();
		for(Person person:personVal) {
			person.printUserDetails();
		}
		
	}

}

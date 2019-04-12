package com.class21;

import com.class20.AccessModifiers2;

public class TestAccessModifiers {

	public static void main(String[] args) {
		AccessModifiers2 obj=new AccessModifiers2();
		obj.isPalindrome("Hello"); //accessing public method in different package
		System.out.println(obj.name3);////accessing public variable in different packag
	}
}
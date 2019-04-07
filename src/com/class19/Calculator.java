package com.class19;

public class Calculator {

	static int sum(int a,int b,int c) {
		return (a+b+c);
	}
	static int average (int a,int b, int c) {
		return (a+b+c)/3;
	}
	static int minimum(int a, int b, int c) {
		int min=a;
		if(a<b&&a<c) {
			min=a;
		}else if(b<c&&b<a) {
		min=b;
	   }else {
		min =c;
	}
		return min;
	}
	static int maximum(int a, int b, int c) {
		int max=a;
		if(a>b&&a>c) {
			max=a;
		}else if(b>c&&b>a) {
		max=b;
	   }else {
		max =c;
	}
		return max;
	}
	
}

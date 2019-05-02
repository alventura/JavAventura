package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<>();
		
		words.add("House");
		words.add("Sky");
		words.add("Giant");
		words.add("Cold");
		words.add("Page");
		
		Iterator<String> iterator=words.iterator();
		while (iterator.hasNext()) {
			String word=iterator.next();
			if(word.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);
	}

}

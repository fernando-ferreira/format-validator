package br.com.sample.util.test;

import java.util.ArrayList;
import java.util.List;

import br.com.sample.util.Matcher;

public class TestMatchingValue {
	private static final List<String> nameList = new ArrayList<String>();
	
	static {
		nameList.add("Fernando");
        nameList.add("Milena Balzano");
        nameList.add("Kaua Belo");
        nameList.add("Fernando Ferreira");
	}
	
	public static void main(String[] args) {
		String word = "Fernando";
		
		List<String> foundItems = Matcher.matchValue(nameList, word);
		
		for (String name: foundItems) {
			System.out.println("Found item into the list: " + name);
		}
	}

}

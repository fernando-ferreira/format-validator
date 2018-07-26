package br.com.sample.util;

import java.util.ArrayList;
import java.util.List;

public class Matcher {
	public static List<String> matchValue(List<String> list, String value) {
		List<String> foundItems = new ArrayList<String>();
		
		for (String item : list) {
			if (item.toLowerCase().contains(value.toLowerCase())) {
				foundItems.add(item);
			}
		}
		
		return foundItems;
	}
}

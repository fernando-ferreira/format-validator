package br.com.sample.util.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

import br.com.sample.util.Matcher;

public class TestMatchingValue {
	private List<String> nameList;
	
	@Before
	public void PrepareListToMatcher() {
		this.nameList = new ArrayList<String>();
		
		this.nameList.add("John");
		this.nameList.add("Charlie");
		this.nameList.add("Bob");
	}
	
	@Test
	public void GivenValidName_MatcherWorksCorrectly() {
		String name = "Charlie";
		
		List<String> foundName = Matcher.matchValue(nameList, name);
		
		Assert.assertEquals(name, foundName.get(0));
	}

}

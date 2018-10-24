package br.com.sample.util.test;

import org.junit.Test;

import br.com.sample.util.DataFormatPattern;
import junit.framework.Assert;

public class TestDataFormatType {
	
	@Test
	public void isValidPatternForCPF() {
		String expectedPattern = "[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}";
		
		Assert.assertEquals(expectedPattern, DataFormatPattern.CPF.getDataPattern());
	}
	
	@Test
	public void isValidPatternForRG() {
		String expectedPattern = "[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]";
		
		Assert.assertEquals(expectedPattern, DataFormatPattern.RG.getDataPattern());
	}
	
	@Test
	public void isValidPatternForPhoneNumber() {
		String expectedPattern = "[0-9]{4}\\-[0-9]{4}";
		
		Assert.assertEquals(expectedPattern, DataFormatPattern.PHONE_NUMBER.getDataPattern());
	}
}

package br.com.sample.util.test;

import org.junit.Test;

import br.com.sample.util.Validator;
import junit.framework.Assert;

public class TestValidator {
	
	@Test
	public void GivenCorrectData_MatcherIdentifyCorrectPattern() {
		
		String CPF   = "333.333.333-33";
		String RG    = "44.444.444-4";
		String PHONE = "5555-5555";
		
		Validator validator = new Validator();
		
		Assert.assertTrue(validator.validCpf(CPF));
		
		Assert.assertTrue(validator.validRg(RG));
		
		Assert.assertTrue(validator.validPhoneNumber(PHONE));
	}
}

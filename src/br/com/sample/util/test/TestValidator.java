package br.com.sample.util.test;

import br.com.sample.util.Validator;

public class TestValidator {
	public static void main(String[] args) {
		String CPF   = "333.333.333-33";
		String RG    = "44.444.444-4";
		String PHONE = "5555-5555";
		
		Validator validator = new Validator();
		
		if (validator.validCpf(CPF)) {
			System.out.println("CPF is correct");
		} else {
			System.out.println("CPF is not correct");
		}
		
		if (validator.validRg(RG)) {
			System.out.println("RG is correct");
		} else {
			System.out.println("RG is not correct");
		}
		
		if (validator.validPhoneNumber(PHONE)) {
			System.out.println("Phone number is correct");
		} else {
			System.out.println("Phone number is not correct");
		}
	}
}

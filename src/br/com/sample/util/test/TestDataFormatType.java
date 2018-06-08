package br.com.sample.util.test;

import br.com.sample.util.DataFormatType;

public class TestDataFormatType {

	public static void main(String[] args) {
		listDataTypes();
		
		isValidPatternForCPF();
		
		isValidPatternForRG();
		
		isValidPatternForPhoneNumber();
	}

	private static void listDataTypes() {
		for(DataFormatType type : DataFormatType.values()) {
			System.out.println(type + " -> " + type.getDataPattern());
		}
	}
	
	private static void isValidPatternForCPF() {
		String expectedPattern = "[0-9]{3}'.'[0-9]{3}'.'[0-9]{3}'-'[0-9]{2}";
		
		if (DataFormatType.CPF.getDataPattern().equals(expectedPattern)) {
			System.out.println("Ok. CPF Pattern is correct.");
		} else {
			System.out.println("No way. CPF Pattern is NOT correct.");
		}
	}
	
	private static void isValidPatternForRG() {
		String expectedPattern = "[0-9]{2}'.'[0-9]{3}'.'[0-9]{3}'-'[0-9]";
		
		if (DataFormatType.RG.getDataPattern().equals(expectedPattern)) {
			System.out.println("Ok. RG Pattern is correct.");
		} else {
			System.out.println("No way. RG Pattern is NOT correct.");
		}
	}
	
	private static void isValidPatternForPhoneNumber() {
		String expectedPattern = "[0-9]{4}'-'[0-9]{4}";
		
		if (DataFormatType.PHONE_NUMBER.getDataPattern().equals(expectedPattern)) {
			System.out.println("Ok. Phone number Pattern is correct.");
		} else {
			System.out.println("No way. Phone number Pattern is NOT correct.");
		}
	}
}

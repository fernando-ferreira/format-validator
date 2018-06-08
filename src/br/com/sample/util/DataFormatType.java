package br.com.sample.util;

public enum DataFormatType {
	CPF("[0-9]{3}'.'[0-9]{3}'.'[0-9]{3}'-'[0-9]{2}"), 
	RG("[0-9]{2}'.'[0-9]{3}'.'[0-9]{3}'-'[0-9]"), 
	PHONE_NUMBER("[0-9]{4}'-'[0-9]{4}");
	
	private String pattern;
	
	private DataFormatType(String pattern) {
		this.pattern = pattern;
	}
	
	public String getDataPattern() {
		return this.pattern;
	}
}

package br.com.sample.util;

public class Validator {
	private DataValidator dataValidator;
	
	public Validator() {
		this.dataValidator = new DataValidator();
	}
	
	public boolean validCpf(String cpf) {
		return this.dataValidator.validate(cpf, DataFormatType.CPF);
	}
	
	public boolean validRg(String rg) {
		return this.dataValidator.validate(rg, DataFormatType.RG);
	}
	
	public boolean validPhoneNumber(String phoneNumber) {
		return this.dataValidator.validate(phoneNumber, DataFormatType.PHONE_NUMBER);
	}
}

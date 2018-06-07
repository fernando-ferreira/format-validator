package br.com.sample.util;

public class DataValidator implements Validator {
	
	private DataValidator(DataFormatType dataFormatType) {
		
	}

	public DataValidator getInstance(DataFormatType dataFormatType) {
		return new DataValidator(dataFormatType);
	}

	@Override
	public boolean validate(String data, Validator pattern) {
		// TODO Auto-generated method stub
		return false;
	}
}

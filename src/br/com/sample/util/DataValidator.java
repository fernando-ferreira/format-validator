package br.com.sample.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator implements IDataValidator {

	@Override
	public boolean validate(String data, DataFormatType dataFormatType) {
		Pattern pattern = Pattern.compile(dataFormatType.getDataPattern());
		Matcher matcher = pattern.matcher(data);
		
		return matcher.find();
	}
}

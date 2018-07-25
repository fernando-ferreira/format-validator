package br.com.sample.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator implements IDataValidator {

	@Override
	public boolean validate(String data, DataFormatPattern dataFormatPattern) {
		Pattern pattern = Pattern.compile(dataFormatPattern.getDataPattern());
		Matcher matcher = pattern.matcher(data);
		
		return matcher.find();
	}
}

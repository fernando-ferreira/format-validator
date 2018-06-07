package br.com.sample.util;

public interface Validator {

	boolean validate(String data, Validator pattern);
}
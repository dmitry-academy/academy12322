package by.academy.lesson8.validator;

import java.util.regex.Pattern;

public interface Validator {

	Pattern getPattern();

	default boolean isValid(String s) {
		return getPattern().matcher(s).matches();
	}
}

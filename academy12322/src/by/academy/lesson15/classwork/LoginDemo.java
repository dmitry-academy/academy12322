package by.academy.lesson15.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1.	Создать статический метод который принимает на вход три параметра: 
//	login, password и confirmPassword. Login должен содержать только латинские буквы,
//	цифры и знак подчеркивания. Длина login должна быть меньше 20 символов. 
//	Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException. 
//	Password должен содержать только латинские буквы, цифры и знак подчеркивания. 
//	Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
//	Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.  
//	WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
//	второй принимает сообщение исключения и передает его в конструктор класса Exception. 
//	Обработка исключений проводится внутри метода. Используем multi-catch block. 
//Метод возвращает true, если значения верны или false в другом случае. 
public class LoginDemo {

	private static final Pattern VALIDATION_PATTERN = Pattern.compile("[a-zA-Z0-9_]{5,20}");

	public static void main(String... strings) {

		System.out.println(login("test", "alalala", "alalala"));
		System.out.println(login("test1", "alalala", "alalala"));
		System.out.println(login("test1", "ala", "alalala"));
		System.out.println(login("test1", "alalala", "alalala"));
		System.out.println(login("test123333333333333333333333333333", "alalala", "alalala"));
	}

	public static boolean login(String login, String password, String confirmPassword) {
		try {
			return validate(login, password, confirmPassword);
		} catch (WrongLoginException | WrongPasswordException e) {
			System.out.println(e);
			return false;
		}
	}

	public static boolean validate(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {

		Matcher mLogin = VALIDATION_PATTERN.matcher(login);
		Matcher mPassword = VALIDATION_PATTERN.matcher(password);

		if (!mLogin.matches()) {
			throw new WrongLoginException("Логин не соответствует паттерну");
		}
		if (!mPassword.matches()) {
			throw new WrongPasswordException("Пароль не соответствует паттерну");
		}
		if (!password.equals(confirmPassword)) {
			throw new WrongPasswordException("Пароли не совпадают");
		}

		return true;
	}
}

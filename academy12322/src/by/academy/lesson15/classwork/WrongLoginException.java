package by.academy.lesson15.classwork;

public class WrongLoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongLoginException() {
		super();
	}

	public WrongLoginException(String message) {
		super(message);
	}

}

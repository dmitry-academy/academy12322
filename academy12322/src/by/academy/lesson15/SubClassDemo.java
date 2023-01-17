package by.academy.lesson15;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass s = null;
		try {
			s = new SubClass();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		s.start();

		try {
			s.stop();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

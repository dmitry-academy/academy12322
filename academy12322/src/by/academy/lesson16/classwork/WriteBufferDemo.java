package by.academy.lesson16.classwork;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBufferDemo {

	public static void main(String[] args) {
		byte[] buffer = new byte[1028];
		buffer[0] = 50;
		buffer[1] = 60;
		buffer[2] = 20;
		buffer[3] = (byte) 'a';
		buffer[4] = (byte) 'b';
		buffer[5] = (byte) 'c';
		buffer[6] = (byte) 'd';
		try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("a.txt"))) {

			output.write(buffer, 3, 2);
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}

}

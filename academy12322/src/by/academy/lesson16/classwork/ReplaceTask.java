package by.academy.lesson16.classwork;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceTask {

	private final static String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	private final static String replaceChars = "aeuioy";

	public static void main(String[] args) {
		File dir = new File("io");

		if (!dir.exists()) {
			dir.mkdirs();
		}
		File readFile = new File(dir, "read.txt");
		if (!readFile.exists()) {
			try {
				readFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(readFile))) {
			os.write(text.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (BufferedWriter os = new BufferedWriter(new FileWriter(readFile))) {
			os.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (replaceChars.contains(Character.valueOf((char) 3).toString())) {

		}
	}

}

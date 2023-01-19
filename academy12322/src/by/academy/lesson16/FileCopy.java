package by.academy.lesson16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileCopy {

	public static final String INPUT_FILE_PATH = "file.txt";
	public static final String OUTPUT_FILE_PATH = "copied_file.txt";

	public static void main(String[] args) throws IOException {
		File dir = new File("io");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		File inputFile = new File(dir, INPUT_FILE_PATH);
		if (!inputFile.exists()) {
			inputFile.createNewFile();
		}

		File outputFile = new File(dir, OUTPUT_FILE_PATH);
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}

		try (FileInputStream fileIn = new FileInputStream(inputFile);
				OutputStream fileOut = new FileOutputStream(outputFile)) {
			int a;

			while ((a = fileIn.read()) != -1) {
				System.out.println((char) a);
				if ((char) a == ' ') {
					fileOut.write('_');
				} else {
					fileOut.write(a);
				}
			}
		}
	}
}
package by.academy.lesson16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
	public static void main(String[] args) throws IOException {
		int size = 0;

		File file = new File("io/file.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		try (FileWriter fw = new FileWriter(file, true); BufferedReader fr = new BufferedReader(new FileReader(file))) {

			fw.write("\nLearn\nJava!\n");
//			fw.close();
			fw.flush();

			int i;
//			while ((i = fr.read()) != -1) {
//				System.out.println((char) i);
//				size++;
//			}
			String s = null;
			while ((s = fr.readLine()) != null) {
				System.out.println(s);
			}

			System.out.println("Количество прочитанных символов: " + size + " ");
//			fw.write("Learn\nJava!\n");
//			fw.flush();

		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
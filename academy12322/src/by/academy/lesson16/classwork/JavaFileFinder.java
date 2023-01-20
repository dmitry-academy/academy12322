package by.academy.lesson16.classwork;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JavaFileFinder {

	public static void main(String[] args) {
		File academy = new File("./");

		List<String> javaFiles = new ArrayList<>();
		for (File file : academy.listFiles()) {
			checkJavaFileRecursevly(file, javaFiles);
		}
		
	}

	public static void checkJavaFileRecursevly(File file, List<String> javaFiles) {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				checkJavaFileRecursevly(f, javaFiles);
			}
		} else if (file.getName().endsWith(".java")) {
			javaFiles.add(file.getName());
		}
	}
}

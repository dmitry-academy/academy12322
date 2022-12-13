package by.academy.lesson6.regexp.tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	static Pattern pattern = Pattern.compile("[!.,;:]");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matcher matcher = pattern.matcher(sc.nextLine());

		int counter = 0;
		while (matcher.find()) {
			System.out.println(matcher.group());
			counter++;
		}
		System.out.println(counter);
		sc.close();
	}

}

package by.academy.test;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 1 строку:");
		String firstString = sc.next();
		System.out.println("Введите 2 строку:");
		String secondString = sc.next();
		for (int i = 0; i < firstString.length(); i++) {
			if (!secondString.contains(String.valueOf(firstString.charAt(i)))) {
				System.out.println("False");
				return;
			}
		}
		System.out.println(Boolean.TRUE);
	}

}
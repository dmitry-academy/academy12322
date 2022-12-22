package by.academy.lesson8.classwork;

import java.util.Iterator;

public class Book implements Printable {
	private String name;

	public Book() {

	}

	public Book(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("Book: " + name);
	}

	public static void printBooks(Printable[] printable) {
		for (Printable p : printable) {
			if (p instanceof Book) {
				p.print();
			}
		}
	}

}

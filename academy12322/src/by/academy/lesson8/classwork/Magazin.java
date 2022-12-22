package by.academy.lesson8.classwork;

public class Magazin implements Printable {
	private String name;
	int year;

	public Magazin() {
	}

	public Magazin(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	@Override
	public void print() {
		System.out.println("Magazin: " + name);
	}

	public static void printMagazins(Printable[] printable) {
		for (Printable p : printable) {
			if (p instanceof Magazin) {
				p.print();
			}
		}
	}
}

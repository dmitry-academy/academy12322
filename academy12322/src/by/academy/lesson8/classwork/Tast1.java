package by.academy.lesson8.classwork;

//1.	а) Определить интерфейс Printable, содержащий метод void print().
//б) Определить класс Book, реализующий интерфейс Printable.
//в) Определить класс Magazine, реализующий интерфейс Printable.
//г) Создать массив типа Printable, который будет содержать книги и журналы.
//д) В цикле пройти по массиву и вызвать метод print() для каждого объекта. 
//е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine, 
//который выводит на консоль названия только журналов.  
//Создать статический метод printBooks(Printable[] printable) в классе Book, 
//который выводит на консоль названия только книг. 
//Используем оператор instanceof.

public class Tast1 {
	public static void main(String... args) {
		Printable[] array = new Printable[5];
		array[0] = new Book("Колобок");
		array[1] = new Book("Конек-горбунок");
		array[2] = new Book("Илья Муромец");
		array[3] = new Magazin("Журнал1", 2000);
		array[4] = new Magazin("Журнал2", 2010);
		for (Printable p : array) {
			p.print();
		}

		System.out.println("---------------");
		System.out.println("Books");
		System.out.println("---------------");
		Book.printBooks(array);
		System.out.println("---------------");
		System.out.println("Magazins");
		System.out.println("---------------");
		Magazin.printMagazins(array);
	}
}

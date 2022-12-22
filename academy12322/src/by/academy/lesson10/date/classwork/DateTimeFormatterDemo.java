package by.academy.lesson10.date.classwork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		DateTimeFormatter formatterLDT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm", Locale.US);

		LocalDateTime ldt = LocalDateTime.parse("01-01-2020 11:11", formatterLDT);
		System.out.println(ldt);

		DateTimeFormatter formatterDT = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);

		LocalDate ld = LocalDate.parse("01-01-2020", formatterDT);
		System.out.println(ld);

		DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd-yyyy", Locale.US);

		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		System.out.println(custom.format(ldt1));

		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy, MMMM d", Locale.US);
		System.out.println(ld.format(newFormat));

	}

}

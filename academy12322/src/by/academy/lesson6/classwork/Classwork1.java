package by.academy.lesson6.classwork;

//a) Напишите метод, который принимает в качестве параметра любую строку,
// например “I like Java!!!”. 
//б) Распечатать последний символ строки. Используем метод String.charAt().
//в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). 
//д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
//ж) Заменить все символы “а” на “о”. 
//з) Преобразуйте строку к верхнему регистру.
//и) Преобразуйте строку к нижнему регистру.
//к) Вырезать строку Java c помощью метода String.substring().
public class Classwork1 {
	public static void main(String... args) {
		String str = "aaabc".replace('a', 'y');
		process(str);
	}

	public static void process(String str) {
		String s = "";

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.replace("1", "2"));
		System.out.println(s.toLowerCase());

		StringBuilder sb = new StringBuilder();
		sb.replace(0, 0, str);
	}
}

package by.academy.lesson6.classwork;

//Напишите метод, заменяющий в строке каждое второе вхождение 
//«object-oriented programming» (не учитываем регистр символов) на «OOP». 
//Например строка:
//"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
//должна быть преобразована в 
//"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming 
//bla."
public class Task3 {
	public static void main(String... argss) {
		String string = "Object-oriented programming is a programming language model "
				+ "organized around objects rather than 'actions' and data rather "
				+ "than logic. Object-oriented programming blabla. Object-oriented programming bla.";
		String searchString = "Object-oriented programming".toLowerCase();
		String indexString = string.toLowerCase();
		StringBuilder sb = new StringBuilder(string);

		int counterOOP = 0;
		int indexOOP = 0;

		while (indexOOP != -1) {
			indexOOP = indexString.indexOf(searchString, indexOOP + 1);
			counterOOP++;
		}

		int size = searchString.length();
		int index = indexString.lastIndexOf(searchString);
		int counter = 0;

		while (index != -1) {
			if (counter % 2 == 1 && counterOOP % 2 == 1 || counter % 2 == 0 && counterOOP % 2 == 0) {
				sb.replace(index, index + size, "OOP");
			}
			index = indexString.lastIndexOf(searchString, index - 1);
			counter++;
		}
		System.out.println(sb);
	}
}

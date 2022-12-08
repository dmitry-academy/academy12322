package by.academy.lesson5.classwork;

public class CatExample {

	public static void main(String... args) {
		Cat c = new Cat("");
		c.setName("Test");

		Cat c2 = c;
		c2.setName("Васька");

		System.out.println(c);

//		String s1 = "test";
//		String s2 = "test";
//		String s4 = "test";
//		String s5 = "test";
//		String s6 = "test";
//		String s7 = "test";
//		String s8 = "test";
		String s3 = new String("test");
		s3.intern();
		String s1 = "test";
	}
}

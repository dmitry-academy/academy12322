package by.academy.lesson5.strings;

import java.util.Arrays;

public class StringJoinDemo {
	public static void main(String... args) {
		String result = String.join(", ", "foobar", "foo", "bar");
		System.out.println(result);

//		String[] array = { "foobar", "foo", "bar" };
//		String result = "";
//		for (int i = 0; i < array.length; i++) {
//			result = result + array[i];
//			if (i != array.length - 1) {
//				result = result + ",";
//			}
//		}
//		System.out.println(result);
		String[] arr = {};
		test();
		test(arr);
		test("1");
		test("1", "2", "3");
	}

	public static void test(String... args) {
		System.out.println(Arrays.toString(args));
	}
}
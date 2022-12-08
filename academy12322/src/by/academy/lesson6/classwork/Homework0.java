package by.academy.lesson6.classwork;

public class Homework0 {
	public void main(String... args) {

		String string = "qqqwwweeerrrtyui"; // 8 unique

		String[] strings = {};

		String minString = strings[0];
		int minChars = Integer.MAX_VALUE;
		
		for (String s : strings) {
			int[] array = new int[256];

			int[] chars = string.chars().toArray();
			for (int c : chars) {
				array[c]++;
			
			}
			int notZiro = 0;
			for (int c : array) {
				array[c]++;
			}
		}
		
	}
}

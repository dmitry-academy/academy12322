package by.academy.lesson3.operators;

public class CompoundOperations {
	public static void main(String[] args) {
		int a = 1;
		int _a = 1;
		int b = 2;
		int c = 3;
		a += 3;
		_a = _a + 3;
		b *= 2;
		c += a * b;
		c = c + a * b;
		System.out.println(a);
		System.out.println(_a);
		System.out.println(b);
		System.out.println(c);
		int i = 0;
//		i = i + 1;
//		i++;
//		++i;
//		i += 1;
		System.out.println(i);

		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);

	}
}
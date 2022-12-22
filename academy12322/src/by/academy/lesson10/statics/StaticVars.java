package by.academy.lesson10.statics;

import java.util.Arrays;

public class StaticVars {
	int a;
	static int b;
	static int c = 3;

	static String[] arr = null;

	{
		arr = new String[10];
		arr[0] = "test string1";
		System.out.println("block StaticVars");
	}
	static {
		arr = new String[10];
		arr[0] = "test string2";
		System.out.println("static block StaticVars");
	}

	public StaticVars() {
		super();
		System.out.println("StaticVars constructor");
	}

	public static void main(String[] args) {
		StaticVars staticVars = new StaticVars();
		StaticVars staticVars1 = new StaticVars();
		StaticVars staticVars2 = new StaticVars();
//		System.out.println(Arrays.toString(StaticVars.arr));

//		System.out.println(staticVars.a);
//		System.out.println(b);

//		System.out.println(Arrays.toString(arr));
	}

	public void test() {

	}
}
package by.academy.lesson12.generics;

public class MyClass<T> implements MyInterface<T> {

	@Override
	public T someMethod(T t) {
		return t;
	}

	public static void main(String[] args) {
		MyInterface<String> object = new MyClass<>();
		String str = object.someMethod("some string");
		
		MyInterface<Integer> objInteg = new MyClass<>();
		Integer integ = objInteg.someMethod(1);
	}
}
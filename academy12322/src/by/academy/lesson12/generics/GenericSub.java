package by.academy.lesson12.generics;

import by.academy.lesson7.deal.Cheese;
import by.academy.lesson7.deal.Product;

public class GenericSub<T, V, K> extends GenericSuper<Product> {

	public GenericSub(T ob) {
		super(new Cheese());
	}
}
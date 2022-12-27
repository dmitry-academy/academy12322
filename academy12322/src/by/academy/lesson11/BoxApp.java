package by.academy.lesson11;

import by.academy.lesson7.deal.Cheese;
import by.academy.lesson7.deal.PlasticBag;
import by.academy.lesson7.deal.Product;
import by.academy.lesson8.classwork.Cat;

public class BoxApp {

	public static void main(String[] args) {

		Cat[] catsArray = new Cat[5];
		Cat cat1 = new Cat("Васька");
		Cat cat2 = new Cat("Гарфилд");
		Cat cat3 = new Cat("Снежок");
		Cat cat4 = new Cat("Леопольд");
		Cat cat5 = new Cat("Анигилятор");

		catsArray[0] = cat1;
		catsArray[1] = cat2;
		catsArray[2] = cat3;
		catsArray[3] = cat4;
		catsArray[4] = cat5;

		Box<Cat> catBox = new Box<>();
		catBox.setItems(catsArray);
		System.out.println(catBox);
		catBox.getItems()[0].eat();
		
		Box<Product> productBox = new Box<>();
		Product[] productArray = new Product[5];
		productArray[0] = new Cheese();
		productArray[1] = new PlasticBag(null, null, 0, 0);
		productBox.setItems(productArray);
		
		System.out.println(productBox);
	}

}

package by.academy.lesson11.classwork;

import by.academy.lesson7.deal.Cheese;

public class Task6 {
	
	public static void main (String[] args) {
		
		ThreeGeneric <String, Cheese, Double> threegeneric = new ThreeGeneric <> ("Cheese", new Cheese(), 25.0);
		
		threegeneric.nameClassT();
		threegeneric.nameClassV();
		threegeneric.nameClassK();
		
	}

}

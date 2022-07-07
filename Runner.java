package com.qa.animal;

public class Runner {

	public static void main(String[] args) {
		System.out.println("---------- \nLion");
		Lion Mufasa = new Lion();
		Mufasa.hunt();
		Mufasa.prey();

		System.out.println("---------- \nElephant");
		Elephant Dumbo = new Elephant();
		Dumbo.makeNoise();
		Dumbo.predator();

		System.out.println("---------- \nSnake");
		Snake Kaa = new Snake();
		Kaa.sleep();
		Kaa.prey();

		System.out.println("---------- \nCrocodile");
		Crocodile TickTock = new Crocodile();
		TickTock.makeNoise();
		TickTock.predator();

	}

}

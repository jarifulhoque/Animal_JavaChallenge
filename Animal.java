package com.qa.animal;

abstract class Animal implements Pred, Preys {
	abstract void sleep();

	abstract void makeNoise();

	abstract void hunt();
	
	public String size;
	public int age;
	public String habitat;
}

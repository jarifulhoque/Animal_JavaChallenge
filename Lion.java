package com.qa.animal;

class Lion extends Animal {

	@Override
	public void sleep() {
		System.out.println("18hourzzzzzzzzzzzzzzz");
	}

	@Override
	public void makeNoise() {
		System.out.println("Roar!");
	}

	@Override
	public void hunt() {
		System.out.println("Let the Mrs do the work");
	}

	@Override
	public void prey() {
		System.out.println("Anything and Everything that walks except elephants");
	}

	@Override
	public void predator() {
		System.out.println("Nada");

	}

}

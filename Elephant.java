package com.qa.animal;

class Elephant extends Animal {

	@Override
	public void sleep() {
		System.out.println("Loud snoringzzzzzzzzz");
	}

	@Override
	public void makeNoise() {
		System.out.println("Trumpet sounds??");
	}

	@Override
	public void hunt() {
		System.out.println("The trees aren't safe");
	}

	@Override
	public void predator() {
		System.out.println("Nope. Too big");
	}

	@Override
	public void prey() {
		System.out.println("Leaves mostly");
	}

}

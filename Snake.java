package com.qa.animal;

class Snake extends Animal {

	@Override
	public void sleep() {
		System.out.println("Hisszzzzz Hisszzzzz");
	}

	@Override
	public void makeNoise() {
		System.out.println("Rattling intensifies");
	}

	@Override
	public void hunt() {
		System.out.println("Slither. Sneaky. Slither. And ya bit!");
	}

	@Override
	public void predator() {
		System.out.println("Mongoose? Bobcats?");
	}

	@Override
	public void prey() {
		System.out.println("Mice and all things small and fuzzy");
	}

}

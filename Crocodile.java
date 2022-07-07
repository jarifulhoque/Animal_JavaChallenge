package com.qa.animal;

class Crocodile extends Animal {

	@Override
	public void sleep() {
		System.out.println(".......");
	}

	@Override
	public void makeNoise() {
		System.out.println("Blub blub blub");
	}

	@Override
	public void hunt() {
		System.out.println("Snap. Lock. Death Rolls go Brrrrrr ");
	}

	@Override
	public void prey() {
		System.out.println("Anything that gets too comfy in the water");
	}

	@Override
	public void predator() {
		System.out.println("Gucci?");
	}

}

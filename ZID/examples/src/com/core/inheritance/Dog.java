package com.core.inheritance;

public class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
		super.eat();
	}

	public static void main(String args[]) {
		Animal a = new Dog();
		a.eat();

	}
}
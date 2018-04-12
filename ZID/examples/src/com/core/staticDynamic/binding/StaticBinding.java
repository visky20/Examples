package com.core.staticDynamic.binding;

public class StaticBinding {

	private void eat() {
		System.out.println("Static Binding at compile time...");
	}

	public static void main(String args[]) {
		StaticBinding d1 = new StaticBinding();
		d1.eat();
	}
}
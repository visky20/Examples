package com.core.java8.defaultMethod;

class TestClass implements TestInterface {
	// Implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		TestClass d = new TestClass();
		d.square(4);

		// Static method executed
		TestInterface.show();
	}
}
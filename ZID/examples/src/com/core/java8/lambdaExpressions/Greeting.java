package com.core.java8.lambdaExpressions;


@FunctionalInterface
public interface Greeting {
	
	void perform();
	default void another() {
		System.out.println("in another method");
	}

}

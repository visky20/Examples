package com.core.lambdaExpressions;


@FunctionalInterface
public interface Greeting {
	
	void perform();
	default void another() {
		System.out.println("in another method");
	}

}

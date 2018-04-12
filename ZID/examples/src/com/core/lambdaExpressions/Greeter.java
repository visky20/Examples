package com.core.lambdaExpressions;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();

	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting myLambdaFunction = () -> System.out.println("Hello World Lambda Expression !!!");
		
		greeter.greet(myLambdaFunction);
		greeter.greet(helloWorldGreeting);
		
		Greeting innerClassGreeting = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World inner class !!!");
				
			}
		};
		
		innerClassGreeting.perform();
	}

}

package com.core.java8.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Exercise1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("bhushan", "jagadish", 21),
				new Person("Vishal", "vish", 26),
				new Person("anna", "rajani", 28),
				new Person("moncy", "chetta", 28)
				
				);
		
		// Step1: Sort list by last name
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step2: create a method that prints all element in list
		
		printAll(people);
		
		// Step3: 
		System.out.println("LastName begin with C");
		printConditionally(people, p -> p.getLastName().startsWith("c"));

		System.out.println("LastName begin with b");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("b");
			}
		});
		
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person person : people ) {
			if(condition.test(person)) {
				System.out.println("start");
				System.out.println(person);
			}
			
		}
		
	}

	private static void printAll(List<Person> people) {
		
		for(Person person : people ) {
			System.out.println(person);
		}
		
	}
	
	interface Condition{
		boolean test(Person p);
	}
}

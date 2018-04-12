package com.core.staticDynamic.binding;

public class Animal {
	void eat(){
		System.out.println("Animal is eating");
	}
	
	void bind() {
		System.out.println("Dynamic Binding calling parent method");
	}

}

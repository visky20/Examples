package com.core.staticDynamic.binding;

public class DynamicBinding extends Animal{
	
	void bind(){
		System.out.println("Dynamic binding calling child method");
	}
	
	public static void main(String args[] ) {
		Animal a = new DynamicBinding();
		a.bind();
	}

}

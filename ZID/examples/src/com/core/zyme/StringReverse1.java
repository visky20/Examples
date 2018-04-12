package com.core.zyme;

public class StringReverse1 {
	public static void main(String[] args) {
		String str = "hello";
		String reverser = reverseString(str);
		System.out.println(reverser);
		for(int i = 0 ; i<10;) {
			// /*i++ /* //
			i++ ;
			System.out.println("hello");
		}
	}
	
	static String reverseString(String str){
		
		if(str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}

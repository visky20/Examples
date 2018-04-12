package com.core.hackthon.visa;

public class StringBracket {

	static String isBalanced(String s) {
		// Complete this function
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			

			if (s.charAt(i) == ')') {
				System.out.println(s.charAt(i-1));
				if (s.charAt(i - 1) != '(')
					return "NO";
			}
			if (s.charAt(i) == '}') {
				System.out.println(s.charAt(i-1));
				if (s.charAt(i - 1) != '{')
					return "NO";
			}
			if (s.charAt(i) == ']') {
				System.out.println(s.charAt(i-1));
				if (s.charAt(i - 1) != '[')
					return "NO";
			}
		}
		return "YES";

	}

	public static void main(String args[]) {
		
		String str = "(({}))"	;
		String result = isBalanced(str);
			System.out.println(result);
	}
}
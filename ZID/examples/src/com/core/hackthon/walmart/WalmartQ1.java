package com.core.hackthon.walmart;

import java.util.Scanner;

public class WalmartQ1 {

	public static void main(String args[]) throws Exception {

		// Write your code here
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		int limit = s.nextInt();
		if(num != "0" && num.length()<13) {
			getMaxNumber(num, limit);
		}
	}

	static String getMaxNumber(String num, int limit) {
		int[] digits = (num).chars().map(c -> c -= '0').toArray();

		int count = 0;
		boolean done = false;
		while (!done) {
			for (int i = 0; i < digits.length; i++) {
				int min = 0;
				if (i == digits.length - 1) {
					continue;
				} else if (digits[i + 1] > digits[i]) {
					min = digits[i];
					digits[i] = digits[i + 1];
					digits[i + 1] = min;
					count++;
					if (count == limit) {
						done = true;
						break;
					}
					break;
				}
			}
		}
		
		StringBuffer strRet=new StringBuffer();
		for(int i : digits) {
            strRet.append(Integer.toString(i));
        }
		System.out.println(strRet);

		return strRet.toString();
	}

}

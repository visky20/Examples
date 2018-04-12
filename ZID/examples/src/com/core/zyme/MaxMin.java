package com.core.zyme;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	static void miniMaxSum(int[] arr) {

		Arrays.sort(arr, 0, arr.length);
		int min = 0;
		int max = 0;
		for(int i=1 ;i<arr.length-1 ;i++) {
			min = min+arr[i];
			max = max+arr[i];
		
		}
		min = min + arr[0];
		max = max + arr[arr.length-1];
		System.out.println();

		// Complete this function
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		miniMaxSum(arr);
		in.close();
	}

}

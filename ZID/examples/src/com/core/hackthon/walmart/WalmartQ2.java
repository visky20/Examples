package com.core.hackthon.walmart;

import java.util.Scanner;

public class WalmartQ2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int movies = s.nextInt();
		int[] kohli = new int[movies];
		int[] dhoni = new int[movies];
		for (int i = 0; i < movies; i++) {
			kohli[i] = s.nextInt();
		}
		for (int i = 0; i < movies; i++) {
			dhoni[i] = s.nextInt();
		}
		System.out.println(findDifference(kohli, dhoni, movies));
	}

	static int findDifference(int kohli[], int dhoni[], int movies) {
		int difference = 0;
		for (int i = 0; i < movies; i++) {

			if (kohli[i] != dhoni[i]) {

				int j = i + 1;
				while (kohli[i] != dhoni[j]) {
					j++;
				}
				while (j != i) {

					int temp = dhoni[j - 1];
					dhoni[j - 1] = dhoni[j];
					dhoni[j] = temp;
					j--;
					difference++;
				}
			}
		}
		return difference;
	}

}

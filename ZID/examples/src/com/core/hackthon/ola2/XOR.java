package com.core.hackthon.ola2;

public class XOR {

	public static void main(String[] args) {
		System.out.println(caluclate(2, 4, 8));

	}

	static int caluclate(int l, int r, int k) {
		int max = 0;
		for (int i = l + 1; i <= r; i++) {

			int count = l ^ i;
			System.out.println("count" + count);
			if (max < count && count <= k) {
				max = count;
			}

		}

		return max;

	}

}

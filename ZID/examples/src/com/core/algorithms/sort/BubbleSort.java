package com.core.algorithms.sort;

import java.util.ArrayList;

/**
 * 
 * @author bjagadish Time Complexity: O(n2) as there are two nested loops.
 */
public class BubbleSort implements SortAlgorithm {

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> list) {
		int size = list.size();
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {

				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}

			}
		}
		return list;

	}

}

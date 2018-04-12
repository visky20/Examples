package com.core.algorithms.sort;

import java.util.ArrayList;

/**
 * 
 * @author bjagadish
 * worst case time complexity of QuickSort is O(n2)
 *
 */
public class QuickSort implements SortAlgorithm {

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> list) {
		quickSort(list, 0, list.size() - 1);
		return list;
	}

	private void quickSort(ArrayList<Integer> list, int low, int high) {

		if (low < high) {

			int pi = partion(list, low, high);

			quickSort(list, low, pi - 1);
			quickSort(list, pi + 1, high);
		}

	}

	private int partion(ArrayList<Integer> list, int low, int high) {

		int pi = low;
		int pivot = list.get(high);
		System.out.println("high pivot: " + pivot);

		for (int i = low; i < high; i++) {
			if (list.get(i) < pivot) {
				int temp = list.get(i);
				list.set(i, list.get(pi));
				list.set(pi, temp);
				pi++;
			}

		}
		int temp = list.get(high);
		list.set(high, list.get(pi));
		list.set(pi, temp);
		System.out.println("list : " + list.toString());
		return pi;
	}

}

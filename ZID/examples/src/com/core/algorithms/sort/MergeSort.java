package com.core.algorithms.sort;

import java.util.ArrayList;

public class MergeSort implements SortAlgorithm {

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> list) {
		mergeSort(list);
		return list;
	}

	private void merge(ArrayList<Integer> list, ArrayList<Integer> leftList, ArrayList<Integer> rightList) {

		int i = 0, j = 0, k = 0;

		while (i < leftList.size() && j < rightList.size()) {

			if (leftList.get(i) <= rightList.get(j)) {
				list.set(k, leftList.get(i));
				i++;
				k++;
			} else {
				list.set(k, leftList.get(j));
				j++;
				k++;
			}
		}

		while (i < leftList.size()) {
			list.set(k, leftList.get(i));
			i++;
			k++;
		}
		while (i < rightList.size()) {
			list.set(k, rightList.get(i));
			j++;
			k++;
		}

	}

	public void mergeSort(ArrayList<Integer> list) {

		int size = list.size();

		if (size < 2)
			return;

		ArrayList<Integer> leftSubList = new ArrayList<>();
		ArrayList<Integer> rightSubList = new ArrayList<>();
		for (int i = 0; i < list.size() / 2; i++)
			leftSubList.add(list.get(i));
		for (int i = list.size() / 2; i < list.size(); i++)
			rightSubList.add(list.get(i));

		mergeSort(leftSubList);
		mergeSort(rightSubList);

		merge(list, leftSubList, rightSubList);

	}

}

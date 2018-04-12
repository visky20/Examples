package com.core.algorithms.sort;

import java.util.ArrayList;
import java.util.HashMap;

public class SortFactory {

	public static HashMap<String, SortAlgorithm> sortMap = new HashMap<>();

	public static ArrayList<Integer> sortMechanism(ArrayList<Integer> list, String type) {

		sortMap.put("selectionSort", new SelectionSort());
		sortMap.put("bubbleSort", new BubbleSort());
		sortMap.put("quickSort", new QuickSort());
		sortMap.put("mergeSort", new MergeSort());
		
		if(null == sortMap.get(type)) {
			return null;
		}

		SortAlgorithm sortAlgorithm = sortMap.get(type);
		return sortAlgorithm.sort(list);

	}

}

package com.core.algorithms.sort;

import java.util.ArrayList;

/**
 * 
 * @author bjagadish
 * Time Complexity: O(n2) as there are two nested loops.
 *
 */
public class SelectionSort implements SortAlgorithm{
	
	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			int index = i;
			for (int j = i; j < list.size(); j++) {
				index = (list.get(index) > list.get(j)) ? j : index;
			}
			int temp = list.get(i);
			list.set(i, list.get(index));
			list.set(index, temp);
		}
		return list;
	}

}

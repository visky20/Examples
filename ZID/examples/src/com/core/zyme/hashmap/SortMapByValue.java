package com.core.zyme.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValue {

	public static void main(String [] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("four", 4);
		map.put("one", 1);
		map.put("three", 3);
		map.put("two", 2);
		map.put("seven", 7);
		map.put("five", 5);
		map.put("six", 6);
		
		System.out.println("Before Sorting :: " +  map.toString());
		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		list.forEach(mapElement ->{
			sortedMap.put(mapElement.getKey(), mapElement.getValue());
		}); 
		System.out.println("After Sorting :: " +  sortedMap.toString());
	}

}

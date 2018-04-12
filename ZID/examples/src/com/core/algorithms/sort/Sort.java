package com.core.algorithms.sort;

import java.util.ArrayList;

public class Sort {
	
	public static void main (String[] args) {
		
		SortFactory sortFactory = new SortFactory();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(16);
		list.add(2);
		list.add(8);
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(7);
		String type = "mergeSort";
		
			System.out.println("Before Sort:" + list);
			System.out.println( type + " Algorithm");
			
			if(null != sortFactory.sortMechanism(list, type)) 				
			System.out.println("After Sort:" + list);
			else 
			System.out.println(type + " alogrithm doesnt exist");
		
		
	}

}

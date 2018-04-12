package com.core.zyme;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TreeSet {
	
	public static void main(String args[]) {
		Set<String> test_set = new HashSet<String>();
		test_set.add("Home");
		test_set.add("School");
		test_set.add("PlayGround");
		test_set.add("BedRoom");
		test_set.add("Kitchen");
		Set<String> tree_Set = new java.util.TreeSet<>(test_set);
		Set set1 = Collections.synchronizedSet(tree_Set);
		System.out.println(tree_Set);
		String str = String.join(",", tree_Set);
		System.out.println("Str: " + str);
	}

}

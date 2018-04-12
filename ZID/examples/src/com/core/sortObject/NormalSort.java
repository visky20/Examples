package com.core.sortObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NormalSort {
	
	
	public static void main (String[] args) {
		List<String> stringList = new ArrayList<String>();
		
		stringList.add("Vishal");
		stringList.add("Bhushan");
		stringList.add("Srihari");
		stringList.add("Prithika");
		stringList.add("Manjamma");
		System.out.println("List order");
		System.out.println(stringList);
		System.out.println("Sort List in Accending order");
		Collections.sort(stringList);
		System.out.println(stringList);
		System.out.println("Sort List in decending order");
		Collections.sort(stringList,Collections.reverseOrder());
		System.out.println(stringList);
	}

}

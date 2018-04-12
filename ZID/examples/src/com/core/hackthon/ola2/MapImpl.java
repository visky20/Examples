package com.core.hackthon.ola2;

import java.util.ArrayList;
import java.util.List;

public class MapImpl {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		
		for(int i = 0 ; i< arrayList.size() ; i++) {
			arrayList.remove(1);
			System.out.println("----------");
			arrayList.forEach(str -> System.out.println(str));
		}
		System.out.println("+++++++++++++");
		arrayList.forEach(str -> System.out.println(str));
	}
}

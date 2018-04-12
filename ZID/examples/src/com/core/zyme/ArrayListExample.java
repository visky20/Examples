package com.core.zyme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("aello");
		arrayList.add("hdeadello");
		arrayList.add("wellweo");
		arrayList.add("helloqw");
		arrayList.add("bellweo");
		arrayList.add("aellfso");
		arrayList.forEach(str -> System.out.println(str));
		arrayList.add(2,"example");
		System.out.println("========================");
		arrayList.forEach(str -> System.out.println(str));
		System.out.println("========================");
		Collections.sort(arrayList);
		System.out.println(arrayList.toString());
	}

}

package com.core.zyme.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestObjAsKey {
	
	public static void main(String [] args) {
		Map<Employee,String> empMap = new HashMap<>();
		Employee bhushan = new Employee("Bhushan", 2000);
		Employee bhushanJ = new Employee("Bhushan", 2000);
		Employee vishal = new Employee("Vishal", 1000);
		empMap.put(bhushan,"BHUSHAN JAGADISH");
		empMap.put(vishal,"VISHAL");
		empMap.put(bhushanJ, "BHUSHAN VISHAL");
		
		System.out.println(empMap.get(bhushanJ));
	}

}

package com.core.sortObject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIceCreamObject {

	public static void main(String args[]) {
		IceCream[] iceCreamsList = new IceCream[4];

		IceCream vanila = new IceCream("vanila", 12.5);
		IceCream butterScotch = new IceCream("butterScotch", 10.5);
		IceCream chocolate = new IceCream("chocolate", 11);
		IceCream mango = new IceCream("mango", 15);

		iceCreamsList[0] = vanila;
		iceCreamsList[1] = butterScotch;
		iceCreamsList[2] = chocolate;
		iceCreamsList[3] = mango;

		List<IceCream> iceCreams = Arrays.asList(iceCreamsList);
		//Arrays.sort(iceCreamsList, new IceCreamComparator());
		Collections.sort(iceCreams, new IceCreamComparator());
		Collections.sort(iceCreams, new IceCreamComparator());

		int i = 0;
		for (IceCream temp : iceCreamsList) {
			System.out.println("falvour " + ++i + " : " + temp.getFlavour() + ", cost : " + temp.getCost());
		}

	}

}

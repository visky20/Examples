package com.core.sortObject;

import java.util.Comparator;

public class IceCreamComparator  implements Comparator<IceCream> {

	@Override
	public int compare(IceCream o1, IceCream o2) {
		
		if(null != o1 && null != o2) {
			return (int) (o1.getCost() -o2.getCost());
		}
		return 0;
	}

}

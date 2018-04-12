package com.core.sortObject;

import java.util.Comparator;

public class IceCream implements Comparable<IceCream> {
	private String flavour;
	private double cost;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public IceCream(String flavour, double cost) {
		super();
		this.flavour = flavour;
		this.cost = cost;
	}

	@Override
	public int compareTo(IceCream iceCream) {

		int compareCost = (int) iceCream.getCost();

		return (int) (this.cost - compareCost);
	}
	
	

	public static Comparator<IceCream> iceCreamComparator = new Comparator<IceCream>() {

		public int compare(IceCream iceCream1, IceCream iceCream2) {

			// ascending order
			return iceCream1.compareTo(iceCream2);

			// descending order
			// return fruitName2.compareTo(fruitName1);
		}

	};

}

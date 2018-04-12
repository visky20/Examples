package com.core.hackthon.ola2;

public class SimpleQuery {
	
	public static void main(String[] args) {
		
		int[] nums = {2,6,3,4,5};
		int[] maxes = {3,5};
		
		System.out.println("counts:: " + counts(nums, maxes));
	}
	
	static int[] counts(int[] nums, int[] maxes) {
		int[] data = new int[maxes.length];
		
		for(int max: maxes ) {
			
		}
		
		for(int i = 0 ; i < maxes.length ;i++ ) {
			int count = 0;
			for(int j = 0 ; j<nums.length ; j++) {
				if(nums[j] <= maxes[i]) {
					count++;
				}
			}
			data[i] = count;
		}
		for(int datanum : data ) {
			System.out.println(datanum);
		}
		
		return data;
		
		
	}
	

}

package com.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int sum = 0;
		try {
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
		} catch (NullPointerException e) {}
		
		return sum;
	}
}

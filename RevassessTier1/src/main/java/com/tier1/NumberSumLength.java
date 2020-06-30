package com.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		int len = String.valueOf(num).length();
		long sum = 0;
		long temp = num;
		for(int i =1; i <= len; i++) {
			sum += Math.pow(temp%10, len);
			temp = temp/10;
		}
		return (num == sum);
	}
}

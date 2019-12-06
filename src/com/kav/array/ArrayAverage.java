
package com.kav.array;

public class ArrayAverage {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i <= a.length; i++) {
			sum = sum + i;

		}
		System.out.println("sum of array:" + sum);
		float avg = sum / a.length;
		System.out.println("Average of array" + avg);
	}

}

package com.kav.controlstatement;

public class SumOfOdd {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = i + sum;

			}

		}
		System.out.println("sum odd numbers are: " + sum);
	}
}

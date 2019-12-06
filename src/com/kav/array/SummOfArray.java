package com.kav.array;

public class SummOfArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int b = 0;

		for (int i = 0; i <= a.length; i++) {
			b = b + i;

			System.out.println(b);
		}
		System.out.println("sum of array:" + b);
	}

}

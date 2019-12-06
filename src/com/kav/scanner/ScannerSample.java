package com.kav.scanner;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Details:");

		String name = sc.next();

		System.out.println("Emp name:" + name);

		int ID = sc.nextInt();

		System.out.println("Emp id:" + ID);

		long Phno = sc.nextLong();

		System.out.println("Emp ph no:" + Phno);

	}
}
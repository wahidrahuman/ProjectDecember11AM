package com.kav.scanner;

import java.util.*;

public class sample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("user input");
	int No=sc.nextInt();
	
	int i=No;
	if (i%2==0) {
	System.out.println("even number");	
	}
	else {
		System.out.println("odd number");
	}
}
}

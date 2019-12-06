package com.kav.consturctor;

public class Instancevariable {

	public int a;
	private void add() {
a=100;
int b=a;
System.out.println("a is"+a);
	System.out.println(b);
	}
	public static void main(String[] args) {
		Instancevariable i=new Instancevariable();
		System.out.println(i.a);
		i.add();
		
	
	}
}

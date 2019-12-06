package com.kav.consturctor;

public class StaticVariable {
	static int a;
	static int b;
	static int c;

	private void add() {
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("in methoda" + c);
	}

	public static void main(String[] args) {
		StaticVariable s = new StaticVariable();
		System.out.println("in class level" + a);
		System.out.println(c);
		s.add();

	}

}

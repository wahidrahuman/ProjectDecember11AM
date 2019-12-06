package com.kav.consturctor;

public class Employee {

	public Employee() {
		this(7894562320l);
		System.out.println("default");
	}
	public Employee(String name) {
		System.out.println("emp name"+"\t"+name);
	}
	public Employee(long phno)
	{
		this("kavin");
		System.out.println("phone no "+phno);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
	
	}
}

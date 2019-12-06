package com.kav.consturctor;

public class Empdetails {
	public Empdetails() {
		this(8080);
		
	}

	public Empdetails(int ID) {
		this("kavin");
		System.out.println("emp ID:"+ID);
	}

	public Empdetails(String name) {
		this("kk@gmail.com", 998877445l);
		System.out.println("emp name"+name);
	}

	public Empdetails(String mail, long phno) {
		System.out.println("Constructor Example using this()");
		System.out.println("emp mail" + mail);
		System.out.println("emp phno" + phno);
	
	}

	public static void main(String[] args) {
		Empdetails e = new Empdetails();
	}

}

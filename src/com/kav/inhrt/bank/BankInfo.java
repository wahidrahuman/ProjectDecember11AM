package com.kav.inhrt.bank;

public class BankInfo extends AxisBank {

	public void saving() {
		System.out.println("saving account");
	}

	public void fixed() {
		System.out.println("Fixed deposit");

	}

	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.deposit();
		b.saving();
		b.fixed();

	}

}
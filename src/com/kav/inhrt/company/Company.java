package com.kav.inhrt.company;

import com.kav.inhrt.client.Client;

public class Company extends Client {
	public void companyName() {
		System.out.println("Company naem:cts");

	}
public static void main(String[] args) {
	Company c= new Company();
	c.companyName();
	c.clientName();
}
}

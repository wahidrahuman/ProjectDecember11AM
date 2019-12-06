package com.kav.oops.importfun;

import com.kav.oops.publicclass.CompanyDetails;

public class Client {
	public void clientId() {
		// TODO Auto-generated method stub
System.out.println("Client Id 9876");
	}
private void clientName() {
	// TODO Auto-generated method stub
System.out.println("Client name Bosch");
}
public static void main(String[] args) {
	Client ci = new Client();
ci.clientId();
ci.clientName();
CompanyDetails cd = new CompanyDetails();
cd.comName();
cd.comId();

}
}

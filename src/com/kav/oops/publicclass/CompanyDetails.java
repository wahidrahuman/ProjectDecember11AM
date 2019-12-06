package com.kav.oops.publicclass;

public class CompanyDetails {
public void comId() {
System.out.println("Comapny Id 1234");
}
public void comName() {
System.out.println("Company name is cts");

}
public static void main(String[] args) {
	CompanyDetails c = new CompanyDetails();
    c.comId();
    c.comName();
Employee e = new Employee();
e.empId();
e.empName();
Employee2 em = new Employee2();
em.emp2Id();
em.emp2Name();
}
}

package com.kav.oops.sysout;

public class CourseDetails {
private void javaCourse() {
System.out.println("java course started");
}
private void oracleCourse() {
	System.out.println("oracle course not started");
}
public static void main(String[] args) {
//classname objectname = new classname();
	CourseDetails A = new CourseDetails();
	//to call method function 
	//objectname.methodname();
	A.javaCourse();
	A.oracleCourse();
}
}

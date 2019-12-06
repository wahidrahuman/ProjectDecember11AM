package com.kav.consturctor;

import java.time.format.SignStyle;

public class Singleton {
static Singleton s ;
private Singleton() {
	
}

public static Singleton st() {
	if (s==null) {
		
		s=new Singleton();
		System.out.println("hai");
	}
	System.out.println(s);
	return s;
}

}

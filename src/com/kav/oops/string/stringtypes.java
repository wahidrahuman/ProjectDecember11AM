package com.kav.oops.string;

public class stringtypes {

	public static void main(String[] args) {
		String s = "kavin";
		String s1 = "kavin";
		System.out.println("literal");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String s2 = new String("karthikeyan");
		String s3 = new String("karthikeyan");
		System.out.println("non-literal");

		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

	
	System.out.println("immutable");
	String s4=s.concat(s1);
	System.out.println(System.identityHashCode(s4));
System.out.println("mutable");
StringBuffer s5 = new StringBuffer("karthikeyan");
System.out.println(System.identityHashCode(s5));
StringBuffer s6 = new StringBuffer("karthikeyan");
System.out.println(System.identityHashCode(s6));
StringBuffer s7=s5.append(s6);

System.out.println(System.identityHashCode(s7));
	}

}

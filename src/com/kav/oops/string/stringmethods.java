package com.kav.oops.string;

public class stringmethods {
public static void main(String[] args) {
	String s="SeleniumAutomationtool";
	System.out.println(s.length());
int c=s.indexOf('o');
System.out.println("character at:"+c);

String up=s.toUpperCase();
System.out.println(up);


String re=s.replace('o', '*');

System.out.println(re);
 

String s1="  testing a   ";
String s2=s.concat(s1);
System.out.println(s2);


String s3="kavin";
String s4="Kavin";

boolean b=s3.isEmpty();
System.out.println(b);

String t=s1.trim();
System.out.println(t);
System.out.println(s1);
System.out.println("S3=s4;"+s3.equals(s4));
System.out.println("S3=s4;"+s3.equalsIgnoreCase(s4));

int i=s.lastIndexOf('o');
System.out.println(i);
}
}

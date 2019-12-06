package com.kav.consturctor;

public class sample {
private  sample() {
	System.out.println("Default constructor");

}
private sample(int a) {
	
int b=1;
	int c=a+b;
	System.out.println(c);
}
public static void main(String[] args) {
	sample s=new sample();
	sample s1= new sample(1);
	
}
}

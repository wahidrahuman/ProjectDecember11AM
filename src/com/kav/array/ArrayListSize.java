package com.kav.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListSize {

	public static void main(String[] args) {
		List<Integer>Al = new ArrayList<Integer>();
		Al.add(10);
		Al.add(20);
		Al.add(30);
		/*
		 * Al.add("kavin"); Al.add('a');
		 */

		System.out.println("Size of array:" + Al.size());
		System.out.println(Al);
		int i=Al.get(2);
		System.out.println(i);
		
		Al.add(3,40);
		System.out.println(Al);
	
		Al.set(3, 50);
		Al.add(4, 20);
		System.out.println(Al);	
	int k=Al.lastIndexOf(20);
	int j=Al.indexOf(20);
	System.out.println(k);
	System.out.println(j);
	boolean b=Al.contains(60);
	System.out.println(b);
	
	System.out.println("LinkedList");
	List<Integer> Ll=new LinkedList<Integer>();
	Ll.addAll(Al);
	Ll.add(100);
	System.out.println(Ll);
	//to get comon vbalues
	Ll.retainAll(Al);
	System.out.println(Ll);
	
	
	List<String> s=new LinkedList<String>();
	s.add("kavcin");
	System.out.println("set sample");
	
	Set<Integer> se=new LinkedHashSet<Integer>();
	
	
	se.addAll(Al);
	se.add(200);
	se.add(300);
	System.out.println(se);
	
	System.out.println("hashset");
	
	Set<Integer> se1=new HashSet<Integer>();
	
	se1.addAll(Al);
	se1.add(200);
	
	System.out.println(se1);
	Set<Integer> se2=new TreeSet <Integer>();
	se2.addAll(Al);
	se2.add(200);
	System.out.println(se2);
	
	
	System.out.println(Al.size()-se.size());
	
	
	
	
	
	}

}

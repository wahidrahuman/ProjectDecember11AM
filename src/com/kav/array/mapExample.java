package com.kav.array;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapExample {
	public static void main(String[] args) {
/*		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();
		mp.put(10, "kavin");
		mp.put(20, "gowtham");
		mp.put(null, "kavin");
		mp.put(10, "null");
		mp.put(50, null);
		System.out.println(mp);
		System.out.println(mp.get(20));
		System.out.println(mp.get(80));
		Collection<String> s = mp.values();
		System.out.println(s);
		Set<Entry<Integer, String>> en = mp.entrySet();
		for (Entry<Integer, String> entry : en) {

			System.out.println(entry);
	
		*/
		Hashtable<Integer,String> h=new Hashtable<Integer, String>();
		h.put(10,"kavin");
		h.put(null,"karthikeyan");
		h.put(20,"kk");
		System.out.println(h);		
		}

	}

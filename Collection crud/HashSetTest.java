package com.monocept.collection.set;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(20);
		hs.add(30);
		hs.add(36);
		hs.add(60);
		hs.add(null);
		
		System.out.println(hs);
		
		//adding element
		hs.add(65);
		System.out.println(hs);
		
		//check duplicate store or not
		hs.add(65);
		System.out.println(hs);
		
		//check size
		
		System.out.println(hs.size());
		
		//check element
		System.out.println(hs.contains(5));
		
		//remove element
		
		hs.remove(30);
		System.out.println(hs);
		
		//empty or not
		System.out.println(hs.isEmpty());
		
		//read and get all data using for each loop
		for(Object e:hs) {
			System.out.println(e);
		}		
		
	}

}

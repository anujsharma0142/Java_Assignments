package com.monocept.collection.set;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
//		HashSet lhs = new HashSet();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		lhs.add(600);
		
		System.out.println(lhs);
		
		//add element
		lhs.add(700);
		System.out.println(lhs);
		
		//remove element
		lhs.remove(400);
		System.out.println(lhs);
		
		//size of LinkedHashSet
		System.out.println(lhs.size());
		
		//isEmpty
		System.out.println(lhs.isEmpty());
		
		//retrieve element using for each loop
		for(Object e : lhs) {
			System.out.println(e);
		}
		
		//element present or not
		System.out.println(lhs.contains(100));
		
		
	}

}

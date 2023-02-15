package com.monocept.collection.set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		
		//add data
		
		tset.add(1);
		tset.add(3);
		tset.add(2);
		tset.add(9);
		tset.add(5);
		
		//print data
		System.out.println(tset); //[1, 2, 3, 4, 5]
		
		//Check size of TreeSet
		System.out.println(tset.size()); //5
		
		//isEmpty method
		System.out.println(tset.isEmpty()); //Returns true if this set contains no elements. //false
		
		//add one more data
		tset.add(5); //it is already in TreeSet so it will not store
		System.out.println(tset);  //[1, 2, 3, 5, 9]
		
		//remove data
		tset.remove(3);
		System.out.println(tset); //[1, 2, 5, 9]
		
		//print first element
		System.out.println(tset.first());
		
		//print last element
		System.out.println(tset.last());
		
		//clear all data
		tset.clear();
		System.out.println(tset); //[]
		
		
		
		
		
	}

}

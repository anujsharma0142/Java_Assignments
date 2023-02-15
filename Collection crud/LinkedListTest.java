package com.monocept.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		//declare linked list
//		LinkedList<Integer> ll = new LinkedList<>(); //it will store String type of data
		LinkedList ll = new LinkedList(); //it will store hetrogenious data
		
		//add Elements into linkedlist
		ll.add(100);
		ll.add("Hi");
		ll.add('A');
		ll.add(true);
		ll.add(null);
		
		System.out.println(ll);
		
		//size of element
		System.out.println(ll.size());
		
		//remove element by index
		ll.remove(2);
		System.out.println("After Removeing , new list: "+ ll);
		
		//Insert new element in the middle of linkedlist
		ll.add(2, 'Z');
		System.out.println(ll);
		
		//retrieve value
		System.out.println(ll.get(1));
		
		//replace with new value or change the value
		ll.set(1, "Hello");
		System.out.println(ll);
		
		//contains 
		System.out.println(ll.contains("Hi"));
		System.out.println(ll.contains("Hello"));
		
		//isEmpty or not
		System.out.println(ll.isEmpty());
		
		//reading element from ll using for Each loop
		for(Object e:ll) {
			System.out.println(e);
		}
		
		
		//itterator() method
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}

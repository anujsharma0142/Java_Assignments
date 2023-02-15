package com.monocept.map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		
		//add items
		lhm.put(1, "Anuj");
		lhm.put(2, "Shrivis");
		lhm.put(3, "Suraj");
		lhm.put(4, "Rishav");
		lhm.put(5, "Aman");
		
		//print all data
		System.out.println(lhm); //{1=Anuj, 2=Shrivis, 3=Suraj, 4=Rishav, 5=Aman}
		
		//get value from key
		System.out.println(lhm.get(2)); //Shrivis
		
		//print using for loop
		System.out.println("**********");
		for(Integer itr:lhm.keySet()) {
			System.out.println(lhm.get(itr));
		}
		
		//remove key value entry using remove method
		lhm.remove(1);
		System.out.println(lhm);
		
		//check our LinkedHashMap empty or not
		System.out.println(lhm.isEmpty()); //false
		
		//print values only
		
		System.out.println(lhm.values()); //[Shrivis, Suraj, Rishav, Aman]
		
		//check value present or not it will return boolean
		System.out.println(lhm.containsValue("Suraj")); //true
		
		//clear all
		lhm.clear();
		System.out.println(lhm);
		
		
		
	}

}

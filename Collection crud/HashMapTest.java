package com.monocept.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap m = new HashMap();
//		HashMap<Integer,String> m =  new HashMap<Integer,String>();
		
		//add key value
		m.put(101, "Anuj");
		m.put(102, "Shrivis");
		m.put(103, "Avani");
		m.put(104, "Pratik");
		m.put(105, "Vaibhav");
		m.put(106, "Basawraj");
		m.put(106, "Rohit"); //if we put same key then value will be replace old value to new
		m.put(107, "Anuj"); //value can be duplicate
		
		System.out.println(m);
		
		//get value with get method
		System.out.println(m.get(105));
		
		//remove pair from hashmap through key
		m.remove(104);
		System.out.println(m);
		
		//contains for value exists or not it will return give true or false
		System.out.println(m.containsKey(104));
		System.out.println(m.containsValue("Anuj"));
		
		// hashamp empty or not
		
		System.out.println(m.isEmpty());
		
		//get only keys from hashmap
		System.out.println(m.keySet()); //returns all the keys as set format
		
		//get only values
		System.out.println(m.values()); //returns all the values as collection
		
		//all the entries as set objects
		System.out.println(m.entrySet());
		
		//retrieve individually but we declare integer type of hashmap first
//		for(int i:m.keySet()) {
//			System.out.println(i);
//		}
		
		//it will give line by line
		for(Object i:m.values()) {
			System.out.println(i);
		}
		
		//for print key and value 
		for(Object i:m.keySet()) {
			System.out.println(i+  "    " + m.get(i));
		}
		
		//entry method
		//********
		
//		for(Map.Entry entry:m.entrySet()) {  //all the entries from the hashmap
//			System.out.println(entry.getKey() + "    " + entry.getValue());
//		}
		
		//Iterator
		System.out.println("*******Iterator*******");
		Set s=m.entrySet();
		
		Iterator itr = s.iterator();
		
			while(itr.hasNext()) {
				Map.Entry entry = (Entry) itr.next(); //101 x entry
				System.out.println(entry.getKey()+ "    " + entry.getValue());
			}
		
	}

}

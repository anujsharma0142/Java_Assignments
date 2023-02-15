package com.monocept.map;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap = new TreeMap<>();
		
		//add key and value
		tmap.put(1, "Anuj");
		tmap.put(2, "Shrivis");
		tmap.put(3, "Pratik");
		tmap.put(4, "Rishav");
		tmap.put(5, "Suraj");
		
		//print all data
		System.out.println(tmap); //{1=Anuj, 2=Shrivis, 3=Pratik, 4=Rishav, 5=Suraj}
		
		//remove key value
		tmap.remove(1, "Anuj");
		
		System.out.println(tmap); //{2=Shrivis, 3=Pratik, 4=Rishav, 5=Suraj}
		
		//retrive data
		System.out.println(tmap.get(3)); //Pratik
		
		//check size of TreeMap
		System.out.println(tmap.size()); //4
		
		//contains value method it will return true or false
		System.out.println(tmap.containsValue("Rishav"));
		//contains key method it will also return true or false
		System.out.println(tmap.containsKey(1));
		
		//keyset
		System.out.println(tmap.keySet()); // Returns a Set view of the keys contained in this map [2, 3, 4, 5]
		
		//clear data from TreeMap
				tmap.clear();
				System.out.println(tmap);
		
	}

}

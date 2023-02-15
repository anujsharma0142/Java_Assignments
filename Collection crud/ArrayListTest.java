package com.monocept.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//create List of string
		ArrayList<String> car = new ArrayList<>();
		car.add("BMW");
		car.add("AUDI");
		car.add("TESLA");
		System.out.println(car);
		
		//insert Element at specific position
		car.add(1, "HONDA");
		System.out.println(car);
		
		//get specific element by index 
		String str = car.get(2);
		System.out.println(str);
		
		//size of the list
		int size = car.size();
		System.out.println(size);
		
		//remove element by index 
		car.remove(0);
		System.out.println(car);
		
		//remove by value
		car.remove("TESLA");
		System.out.println(car);
		
		//find index of specific element
		int index = car.indexOf("AUDI");
		System.out.println(index);
		
		//check specific element present or not
		boolean isThere = car.contains("BMW");
		System.out.println(isThere);
		
		//replace the element
		car.set(1, "AUDIR8");
		System.out.println(car);
		
		//sort element
		Collections.sort(car);
		System.out.println(car);
		
		//clear method
		car.clear();
		System.out.println(car);
		
	}

}

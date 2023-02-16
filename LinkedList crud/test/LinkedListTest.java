package com.monocept.test;

import com.monocept.model.LinkedListCustom;
import com.monocept.model.Node;

public class LinkedListTest {

	public static void main(String[] args) {
		// now creating custom linked list
		LinkedListCustom list = new LinkedListCustom();

		// insert element in linkedlist
		list.insert(10);
		list.insert(8);
		list.insert(9);
		list.insert(12);
		list.insert(4);

		// insert data at start position
		list.insertAtStart(25);
		// Insert at specific position
		list.insertAt(2, 35);

		list.deleteAt(2);

		// display data
		list.show();

	}

}

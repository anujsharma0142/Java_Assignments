package com.monocept.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		//adding elements add() offer()
		
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.offer("C");
		pq.offer("C");
//		pq.offer(100); //hetrogenous data is not allowed here
		
		System.out.println(pq); //insertion order preserved & duplicates allowed int priority queue
		
		//get head element  element() peek()
		
		System.out.println(pq.element()); //if queue empty it will return NoSuchElementException
		
		System.out.println(pq.peek()); //it will return null if element not present
		
		//return and remove element from queue  remove() poll()
		
		System.out.println(pq.remove()); //if queue is empty it will return exception
		System.out.println(pq);
		
		System.out.println(pq.poll()); //if there no element in queue it will return null
		System.out.println(pq);
		
		//read print all the element using for each
		for(Object e:pq) {
			System.out.println(e);
		}
		
		
		
		
	
	}
}

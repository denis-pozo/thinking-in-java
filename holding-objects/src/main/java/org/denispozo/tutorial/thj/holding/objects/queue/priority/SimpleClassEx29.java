package org.denispozo.tutorial.thj.holding.objects.queue.priority;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.PriorityQueue;

/*
 * Chapter - Holding your objects
 * Section - Priority Queue
 * Exercise 29
 */

public class SimpleClassEx29 extends Object {
	
	public static void main(String[] args) {
		PriorityQueue<SimpleClassEx29> priorityQueue = new PriorityQueue<SimpleClassEx29>();
		try{ 
			priorityQueue.offer(new SimpleClassEx29());
			priorityQueue.offer(new SimpleClassEx29());
		}catch (ClassCastException cce) {
			print("Cannot add 2 instances of this class to the priority queue: " + cce.getMessage());
		}
	}
}

package org.denispozo.tutorial.thj.holding.queue;

import java.util.Queue;

/*
 * Chapter - Holding your objects
 * Section - Queue
 * Exercise 27
 */

public class QueueConsumerEx27 {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		Queue<CommandEx27> queue = CommandQueuerEx27.fulfill();
		
		while(queue.peek() != null){
			queue.poll().operation();
		}
	}
}

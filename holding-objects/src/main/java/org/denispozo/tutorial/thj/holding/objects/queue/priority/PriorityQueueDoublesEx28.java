package org.denispozo.tutorial.thj.holding.objects.queue.priority;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.PriorityQueue;
import java.util.Random;

/*
 * Chapter - Holding your objects
 * Section - Priority Queue
 * Exercise 28
 */

public class PriorityQueueDoublesEx28 {
	
	public static void main(String[] args) {
		print("Exercise 28");
		PriorityQueue<Double> doublePQ = new PriorityQueue<Double>();
		
		Random rand = new Random(47);
		for(int i = 0 ; i < 10 ; i++) {
			doublePQ.offer(rand.nextDouble());
		}
		
		while(doublePQ.peek() != null){
			printnr(doublePQ.poll());
		}
	}
}

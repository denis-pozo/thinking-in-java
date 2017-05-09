package org.denispozo.tutorial.thj.holding.queue;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Chapter - Holding your objects
 * Section - Queue
 * Book Example
 */

public class QueueDemo {

	@SuppressWarnings("rawtypes")
	public static void printQ(Queue queue){
		while(queue.peek() != null){
			printnr(queue.remove());
		}
		print();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		
		for(int i = 0 ; i < 10 ; i++) {
			queue.offer(rand.nextInt(i + 10));
		}
		printQ(queue);
		
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Brontosaurus".toCharArray()){
			qc.offer(c);
		}
		printQ(qc);
		
	}
}

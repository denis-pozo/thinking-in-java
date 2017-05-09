package org.denispozo.tutorial.thj.holding.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Chapter - Holding your objects
 * Section - Queue
 * Exercise 27
 */

public class CommandQueuerEx27 {
	
	@SuppressWarnings("rawtypes")
	public static Queue fulfill(){
		Queue<CommandEx27> queue = new LinkedList<CommandEx27>();
		
		queue.offer(new CommandEx27("jump"));
		queue.offer(new CommandEx27("run"));
		queue.offer(new CommandEx27("climb"));
		queue.offer(new CommandEx27("drive"));
		queue.offer(new CommandEx27("walk"));

		return queue;
	}
}

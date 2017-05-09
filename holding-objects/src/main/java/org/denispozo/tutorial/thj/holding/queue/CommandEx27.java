package org.denispozo.tutorial.thj.holding.queue;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Holding your objects
 * Section - Queue
 * Exercise 27
 */

public class CommandEx27 {

	private String command;
	
	public CommandEx27(String command){
		this.command = command;
	}
	
	public void operation() {
		print(command);
	}
}

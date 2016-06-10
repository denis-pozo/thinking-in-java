package org.denispozo.tutorial.thj.holding.objects.ex13;

/*
 * Chapter - Holding your objects
 * Section - LinkedList
 * Exercise 13
 */

public abstract class Event {
	
	private long eventTime;
	protected final long delayTime;
	
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	
	public void start() { // Allows restarting
		eventTime = System.nanoTime() + delayTime;
	}
	
	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}
	
	public abstract void action();

}

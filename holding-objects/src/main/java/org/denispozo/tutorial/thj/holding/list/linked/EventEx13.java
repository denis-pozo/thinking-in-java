package org.denispozo.tutorial.thj.holding.list.linked;

/*
 * Chapter - Holding your objects
 * Section - LinkedList
 * Exercise 13
 */

public abstract class EventEx13 {
	
	private long eventTime;
	protected final long delayTime;
	
	public EventEx13(long delayTime){
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

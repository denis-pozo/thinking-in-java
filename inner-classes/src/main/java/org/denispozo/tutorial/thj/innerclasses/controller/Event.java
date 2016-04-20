package org.denispozo.tutorial.thj.innerclasses.controller;

/*
 * Chapter - Inner Classes
 * Section - Inner Classes and Control Frameworks
 * Exercise 24
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

package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - What's finally for?
 * Example
 */

public class Switch {
	
	private boolean state = false;
	
	public boolean read() { 
		return state; 
	}
	
	public void on() { 
		state = true; print(this); 
	}
	
	public void off() {
		state = false; print(this);
	}
	
	public String toString(){
		return state ? "on" : "off";
	}
}
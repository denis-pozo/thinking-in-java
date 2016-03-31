package org.denispozo.tutorial.thj.interfaces.cycles;

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 18
 */

public class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
	
}

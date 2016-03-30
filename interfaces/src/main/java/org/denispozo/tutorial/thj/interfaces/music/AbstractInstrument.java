package org.denispozo.tutorial.thj.interfaces.music;

import static org.denispozo.tutorial.thj.util.Print.print;

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 9 and 10
 */

public abstract class AbstractInstrument implements Instrument {

	@Override
	public void adjust() {
		print(this + ".adjust() " );
		
	}
}

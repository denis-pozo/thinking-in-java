package org.denispozo.tutorial.thj.exception.converter;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Converting checked to unchecked exceptions
 * Exercise 29
 */

public class StormyInningEx29 extends Inning implements Storm {
	// OK to add new exceptions for constructors, but you must deal 
	// with the base constructor exceptions
	public StormyInningEx29() { }
	public StormyInningEx29(String s) {}
	
	// Regular methods must conform the base class
	public void walk() {}
	
	// Interface cannot add Exceptions to existing methods in 
	// the base class:
		//! public void event() throws RainedOut() {}
	
	// If the method doesn't already exist in the base class,
	// the exception is OK:
	@Override
	public void rainHard() { }
	
	// You can choose to not to throw any exceptions,
	// even if the base version does:
	public void event() {}
	
	// Overridden methods can throw inherited exceptions:
	@Override
	public void atBat() { }
	
	public static void main(String[] args) {
		
		StormyInningEx29 si = new StormyInningEx29();
		si.atBat();
		
		Inning i = new StormyInningEx29();
		i.atBat();
	}

}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

abstract class Inning {
	
	public Inning() throws BaseballException {}
	
	public void event() throws BaseballException {
		// Doesnt actually have to throw anything
	}
	
	public abstract void atBat() throws Strike, Foul;
	public void walk() {} // Throws no checked exceptions
}

class BaseballException extends RuntimeException {
	private static final long serialVersionUID = 1L;
}
class Foul extends RuntimeException {
	private static final long serialVersionUID = 1L;
}
class Strike extends RuntimeException {
	private static final long serialVersionUID = 1L;
}
class StormException extends RuntimeException {
	private static final long serialVersionUID = 1L;
}
class RainedOut extends StormException {
	private static final long serialVersionUID = 1L;
}
class PopFoul extends Foul {
	private static final long serialVersionUID = 1L;
}


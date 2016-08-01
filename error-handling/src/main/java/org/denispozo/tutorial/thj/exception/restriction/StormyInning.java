package org.denispozo.tutorial.thj.exception.restriction;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exception Restrictions
 * Example
 */

public class StormyInning extends Inning implements Storm {
	// OK to add new exceptions for constructors, but you must deal 
	// with the base constructor exceptions
	public StormyInning() throws RainedOut, BaseballException { }
	public StormyInning(String s) throws Foul, BaseballException {}
	
	// Regular methods must conform the base class
		//! void walk() throws PopFoul {}
	
	// Interface cannot add Exceptions to existing methods in 
	// the base class:
		//! public void event() throws RainedOut() {}
	
	// If the method doesn't already exist in the base class,
	// the exception is OK:
	@Override
	public void rainHard() throws RainedOut { }
	
	// You can choose to not to throw any exceptions,
	// even if the base version does:
	public void event() {}
	
	// Overridden methods can throw inherited exceptions:
	@Override
	public void atBat() throws PopFoul { }
	
	public static void main(String[] args) {
		
		try{
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			print("Pop foul");
		} catch (RainedOut e) {
			print("Rained out");
		} catch (BaseballException e) {
			print("Generic baseball exception");
		}
		
		// Strike not thrown in derived version
		try{
			// What happens if you upcast?
			Inning i = new StormyInning();
			i.atBat();
			// You must catch the exceptions from the 
			// base class version of the method:			
		} catch (Strike e) {
			print("Strike");
		} catch (Foul e) {
			print("Foul");
		} catch (RainedOut e) {
			print("RainedOut");
		} catch (BaseballException e) {
			print("Generic baseball exception");
		}
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

class BaseballException extends Exception {}
class Foul extends Exception {}
class Strike extends Exception {}
class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}


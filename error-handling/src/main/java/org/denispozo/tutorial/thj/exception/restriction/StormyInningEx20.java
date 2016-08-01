package org.denispozo.tutorial.thj.exception.restriction;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exception Restrictions
 * Exercise 20
 */

public class StormyInningEx20 extends InningEx20 implements Storm {
	// OK to add new exceptions for constructors, but you must deal 
	// with the base constructor exceptions
	public StormyInningEx20() throws RainedOut, BaseballException { }
	public StormyInningEx20(String s) throws Foul, BaseballException {}
	
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
			StormyInningEx20 si = new StormyInningEx20();
			si.atBat();
			si.questionableCall();
		} catch (PopFoul e) {
			print("Pop foul");
		} catch (UmpireArgument e) {
			print("Umpire argument (StormyInning20");
		} catch (RainedOut e) {
			print("Rained out");
		} catch (BaseballException e) {
			print("Generic baseball exception");
		}
		
		// Strike not thrown in derived version
		try{
			// What happens if you upcast?
			InningEx20 i = new StormyInningEx20();
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

abstract class InningEx20 {
	
	public InningEx20() throws BaseballException {}
	
	public void event() throws BaseballException {
		// Doesnt actually have to throw anything
	}
	
	public abstract void atBat() throws Strike, Foul, UmpireArgument;
	public void questionableCall() throws UmpireArgument {}
	public void walk() {} // Throws no checked exceptions
}

class UmpireArgument extends BaseballException {
	private static final long serialVersionUID = 1L;
}


package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - What's finally for?
 * Example
 */

public class OnOffSwitchWithFinally {

	private static Switch sw = new Switch();
	
	public static void f() throws OnOffException1, OnOffException2 { }

	public static void main(String[] args) {
		try{
			sw.on();
			f();
		} catch (OnOffException1 e1) {
			print("OnOffExcption1");
		} catch (OnOffException2 e2) {
			print("OnOffExcption2");
		} finally {
			sw.off();
		}
	}
}
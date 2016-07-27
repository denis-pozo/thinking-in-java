package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - What's finally for?
 * Example
 */

public class OnOffSwitchWithFinallyAndEx15 {

	private static Switch sw = new Switch();
	
	static Integer[] x = new Integer[1];
	
	public static void f(int i) throws OnOffException1, OnOffException2 { }

	public static void main(String[] args) {
		try{
			sw.on();
			f(x[0]);
		} catch (OnOffException1 e1) {
			print("OnOffExcption1");
		} catch (OnOffException2 e2) {
			print("OnOffExcption2");
		} finally {
			sw.off();
		}
	}
}
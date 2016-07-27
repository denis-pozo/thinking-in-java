package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - What's finally for?
 * Example and Exercise 14
 */

public class OnOffSwitchAndEx14 {

	private static Switch sw = new Switch();
	static Integer[] x = new Integer[1];
	
	public static void f(int i) throws OnOffException1, OnOffException2 { }

	public static void main(String[] args) {
		try{
			sw.on();
			// Code that can throw RuntimeException
			// and leave Switch on:
			f(x[0]);
			sw.off();
		} catch (OnOffException1 e1) {
			print("OnOffExcption1");
			sw.off();
		} catch (OnOffException2 e2) {
			print("OnOffExcption2");
			sw.off();
		}
	}
}
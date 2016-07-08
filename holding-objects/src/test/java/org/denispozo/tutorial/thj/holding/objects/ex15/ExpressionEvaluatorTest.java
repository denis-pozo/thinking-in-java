package org.denispozo.tutorial.thj.holding.objects.ex15;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;
import org.denispozo.tutorial.thj.holding.objects.ex15.ExpressionEvaluator;

/*
 * Chapter - Holding your objects
 * Section - Stack
 * Exercise 15 - tests for evaluating the class
 */

public class ExpressionEvaluatorTest {
	
	String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
	ExpressionEvaluator eEvaluator = new ExpressionEvaluator();
	
	@Test
	public void testStringEvalMethod() {
		print("Test: testStringEvalMethod");
		
		String result = "cnUtreaiytn ursel";
		eEvaluator.printEval(expression);
		assertEquals(result, eEvaluator.stringEval(expression));
	}
}
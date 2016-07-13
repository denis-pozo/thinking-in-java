package org.denispozo.tutorial.thj.holding.objects.ex15;

import static org.junit.Assert.*;

import org.denispozo.tutorial.thj.holding.objects.stack.ExpressionEvaluatorEx15;
import org.junit.Test;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Holding your objects
 * Section - Stack
 * Exercise 15 - tests for evaluating the class
 */

public class ExpressionEvaluatorTest {
	
	String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
	ExpressionEvaluatorEx15 eEvaluator = new ExpressionEvaluatorEx15();
	
	@Test
	public void testStringEvalMethod() {
		print("Test: testStringEvalMethod");
		
		String result = "cnUtreaiytn ursel";
		eEvaluator.printEval(expression);
		assertEquals(result, eEvaluator.stringEval(expression));
	}
}

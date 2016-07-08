package org.denispozo.tutorial.thj.holding.objects.ex15;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import org.denispozo.tutorial.thj.holding.objects.Stack;

/*
 * Chapter - Holding your objects
 * Section - Stack
 * Exercise 15
 */

public class ExpressionEvaluator {
	
	private Stack<Character> stack;
	
	public ExpressionEvaluator () {
		stack = new Stack<Character>();
	}
	
	public void printEval(String expression){
		char [] c = expression.toCharArray();
		
		for(int i = 0 ; i < expression.length() ; i++) {
			
			if(c[i] == '+') stack.push(c[++i]);
			
			else if(c[i] == '-') print(stack.pop());
		}
	}
	
	public String stringEval(String expression){
		char [] c = expression.toCharArray();
		String result = "";
		
		for(int i = 0 ; i < expression.length() ; i++) {
			if(c[i] == '+') stack.push((Character) c[++i]);
			
			else result = result + stack.pop().toString();				
		}

		return result;
	}
}
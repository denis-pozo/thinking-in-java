package es.denis.thinking.chapThree;

import static es.denis.thinking.utils.Print.*;

//Chapter - Controlling Execution: Exercise 009

public class Fibonacci {
	
	private final int FIRST = 1;
	
	public Fibonacci(int i){
		switch(i){
		case 0:
			print("There is no Fibonacci number under or equal to 0");
			break;
		case 1:
			print("" + FIRST);
			print("" + FIRST);
		default:
			print("" + FIRST);
			print("" + FIRST);
			int prev = FIRST;
			int current = FIRST;
			int next = nextFibonacci(prev, current);
			while(next <= i){
				print("" + next);
				prev = current;
				current = next;
				next = nextFibonacci(prev, current);
			}
						
		}
		
	}
	
	private int nextFibonacci(int i, int j){
		return i+j;
	}
	
	public static void main(String ... args){
		Fibonacci cinco = new Fibonacci(5);
		System.out.println(cinco);
		
	}

}

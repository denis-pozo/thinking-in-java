package org.denispozo.tutorial.thj.operators;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

//Chapter - Operators: Exercise 12

public class BinaryOperatorsTwo {

	public static void main(String ... args){
		int number = 0xffff;
		print("This is the binary representation: " + Integer.toBinaryString(number));
		number <<= 1;
		print("This is the binary representation: " + Integer.toBinaryString(number));
		
		for(int i = 0 ; i < 8 ; i++){
			number >>>= 1;
			print("This is the binary representation: " + Integer.toBinaryString(number));
		}
	}

}
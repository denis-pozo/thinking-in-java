package org.denispozo.tutorial.thj.operators;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Operators: Exercise 11

public class BinaryOperatorsOne {

	public static void main(String ... args){
		int number = 0xf4;
		print("This is the binary representation: " + Integer.toBinaryString(number));
		
		for(int i = 0 ; i < 8 ; i++){
			number = number >> 1;
			print("This is the binary representation: " + Integer.toBinaryString(number));
		}
		
		number = 0xf4;
		for(int i = 0 ; i < 8 ; i++){
			number = number << 1;
			print("This is the binary representation: " + Integer.toBinaryString(number));
		}
		
	}
}

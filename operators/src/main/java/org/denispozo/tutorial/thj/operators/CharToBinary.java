package org.denispozo.tutorial.thj.operators;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Operators: Exercise 12


public class CharToBinary {

	public static void main(String[] args) {
		char character = 'A';
		
		printToBinaryString(character);
		
	}

	private static void printToBinaryString(char character) {
		Integer toInteger = Integer.valueOf(character);
		print("Binary representation of char " + character + " - " + Integer.toBinaryString(toInteger));
		
	}
	
	

}

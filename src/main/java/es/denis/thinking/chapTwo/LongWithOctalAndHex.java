package es.denis.thinking.chapTwo;

import static es.denis.thinking.utils.Print.*;

//Chapter - Operators: Exercise 8

public class LongWithOctalAndHex {

	public static void main(String[] args) {
		long a = 0xaf;
		long b = 0123;
		
		print("A(HEX): AF -> " + Long.toBinaryString(a));
		print("B(OCT): 123 -> " + Long.toBinaryString(b));
	}

}

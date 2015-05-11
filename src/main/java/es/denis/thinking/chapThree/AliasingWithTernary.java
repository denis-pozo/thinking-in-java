package es.denis.thinking.chapThree;

import static es.denis.thinking.utils.Print.*;

//Chapter - Controlling Execution: Exercise 005
// Undone

public class AliasingWithTernary {
	public static void main(String[] args) {
		int A = 0x128F;
		int B = 0x143A;
		
		print("A = " + Integer.toBinaryString(A));
		print("B = " + Integer.toBinaryString(B));
		print("A & B = " + Integer.toBinaryString(A&B));
		print("A ^ B = " + Integer.toBinaryString(A&B));
		print("~A = " + Integer.toBinaryString(~A));
		print("~B = " + Integer.toBinaryString(~B));
	}

}

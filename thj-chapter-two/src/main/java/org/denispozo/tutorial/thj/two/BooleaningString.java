package org.denispozo.tutorial.thj.two;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Operators: Exercise 14

public class BooleaningString {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		if(areTheyEqual(s1,s2)){
			print("True");
		}else{
			print("False");
		}
		
		if(arentTheyEqual(s1,s2)){
			print("True");
		}else{
			print("False");
		}
	}

	private static boolean areTheyEqual(String s1, String s2) {
		return s1 == s2;	
	}
	
	private static boolean arentTheyEqual(String s1, String s2){
		return s1 != s2;
	}
}

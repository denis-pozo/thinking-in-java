package org.denispozo.tutorial.thj.four.aExerciseOne;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Initialization & Cleanup
public class AExerciseOne {
	public String s;
	
	public static void main(String [] args){		
		AExerciseOne exOne = new AExerciseOne();
		if(exOne.s == null){
			print("The String member has been initialised by default to null");
		} else {
			print("Unexpected behavior, the String member has not been initialised by default to null");
		}
	}
}

package es.denis.thinking.chapFour;

import static es.denis.thinking.utils.Print.*;

//Chapter - Initialization & Cleanup
public class BExerciseTwo {
	
	public String s1 = "Initialised at definition";
	public String s2;
	
	public BExerciseTwo(){
		s2 = "Initialised within the construtor";
	}
	
	public static void main(String [] args){	
		BExerciseTwo exTwo = new BExerciseTwo();
		print(exTwo.s1);
		print(exTwo.s2);
	}
}

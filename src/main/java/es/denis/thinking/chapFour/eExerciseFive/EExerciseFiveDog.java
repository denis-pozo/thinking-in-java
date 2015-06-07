package es.denis.thinking.chapFour.eExerciseFive;

import static es.denis.thinking.utils.Print.*;

//Chapter - Initialization & Cleanup
public class EExerciseFiveDog {
			
	public void bark(int i){
		print("RufRufRuf");
	}
	
	public void bark(float f){
		print("GuauGuauGuau");
	}
	
	public static void main(String [] args){
		EExerciseFiveDog dogA = new EExerciseFiveDog();
		dogA.bark((int) 1);
		
		EExerciseFiveDog dogB = new EExerciseFiveDog();
		dogB.bark((float) 1);
		
	}
}

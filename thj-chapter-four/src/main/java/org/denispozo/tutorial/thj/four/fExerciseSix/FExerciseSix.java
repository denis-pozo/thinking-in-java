package org.denispozo.tutorial.thj.four.fExerciseSix;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Initialization & Cleanup
public class FExerciseSix {
	
	public void bark(int i, float f){
		print("RufRufRuf");
	}
	
	public void bark(float f, int i){
		print("GuauGuauGuau");
	}
	
	public static void main(String [] args){
		FExerciseSix dogA = new FExerciseSix();
		dogA.bark((int) 1, (float) 1);
		
		FExerciseSix dogB = new FExerciseSix();
		dogB.bark((float) 1, (int) 1);
	}
}

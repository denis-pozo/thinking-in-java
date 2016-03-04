package org.denispozo.tutorial.thj.initcleanup;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Initialization & Cleanup
public class HExerciseEight {
	
	public void firstMethod(){
		print("Calling with this");
		this.secondMethod();
		print("Calling without this");
		secondMethod();
	}
	
	public void secondMethod(){
		print("secondMethod has been called!!!");
	}
	public static void main(String [] args){
		HExerciseEight eight = new HExerciseEight();
		eight.firstMethod();
	}
}

package org.denispozo.tutorial.thj.initcleanup;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Initialization & Cleanup
public class DExerciseFour {
	
	public DExerciseFour(){
		print("Hey guys, how are you doing?");
	}
	
	public DExerciseFour(String s){
		print(s);
	}
	
	public static void main(String [] args){		
		DExerciseFour exThreeA = new DExerciseFour();
		print(exThreeA.toString());
		
		DExerciseFour exThreeB = new DExerciseFour("How are you doing guys?");
		print(exThreeB.toString());
		
	}
}

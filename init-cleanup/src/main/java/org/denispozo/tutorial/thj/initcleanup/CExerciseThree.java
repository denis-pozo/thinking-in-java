package org.denispozo.tutorial.thj.initcleanup;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Initialization & Cleanup
public class CExerciseThree {
	
	public CExerciseThree(){
		print("Hey guys, how are you doing?");
	}
	
	public static void main(String [] args){		
		CExerciseThree exThree = new CExerciseThree();
		print(exThree.toString());
	}
	
}

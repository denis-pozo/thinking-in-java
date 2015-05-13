package es.denis.thinking.chapFour;

import static es.denis.thinking.utils.Print.*;

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

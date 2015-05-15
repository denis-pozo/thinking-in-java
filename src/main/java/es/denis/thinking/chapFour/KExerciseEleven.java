package es.denis.thinking.chapFour;

import static es.denis.thinking.utils.Print.*;

//Chapter - Initialization & Cleanup
public class KExerciseEleven {
	
	
	public KExerciseEleven(){
		print("New Object created");
	}
	
	protected void finalize(){
		print("Object finalized");
	}
	
	public static void main(String [] args){
		KExerciseEleven eleven = new KExerciseEleven();
		eleven.finalize();
		
	}
}

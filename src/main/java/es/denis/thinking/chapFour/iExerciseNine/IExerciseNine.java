package es.denis.thinking.chapFour.iExerciseNine;

import static es.denis.thinking.utils.Print.*;

//Chapter - Initialization & Cleanup
public class IExerciseNine {
	
	
	public IExerciseNine(){
		this("Hello");
	}
	
	public IExerciseNine(String s){
		print("Second constructor has been called!!!");
	}
	
	public void finish(String s){
		print(s);
	}
	
	public static void main(String [] args){
		IExerciseNine eight = new IExerciseNine();
		eight.finish("The End");
		
	}
}

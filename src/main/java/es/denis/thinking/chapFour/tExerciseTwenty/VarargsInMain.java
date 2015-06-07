package es.denis.thinking.chapFour.tExerciseTwenty;

import static es.denis.thinking.utils.Print.*;

public class VarargsInMain {
	
	public static void main(String ...strings){
		for(String s : strings){
			print(s);
		}
	}

}

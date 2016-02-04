package org.denispozo.tutorial.thj.four.tExerciseTwenty;

import static org.denispozo.tutorial.thj.util.Print.*;

public class VarargsInMain {
	
	public static void main(String ...strings){
		for(String s : strings){
			print(s);
		}
	}

}

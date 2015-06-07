package es.denis.thinking.chapFour.sExerciseNineteen;

import static es.denis.thinking.utils.Print.*;

public class Varargs {

	public Varargs(String ... strings){
		for(String s : strings){
			print(s);
		}
	}
	
	public static void main(String [] args){
		Varargs v1 = new Varargs("Hello ", "What " , "is ", "going ", "on?");
		String [] s = new String[]{"Hey, ", "Whats ", "up?"};
		Varargs v2 = new Varargs(s);
		print(v1.toString());
		print(v2.toString());
	}
}

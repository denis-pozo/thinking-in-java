package es.denis.thinking.chapFour.mExerciseThirteen;

import static es.denis.thinking.utils.Print.*;

public class ExplicitStatic {
	public static void main (String ... args){
		print("Inside main ()");
		Cups.cup1.function(99);
	}
	
	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();
}

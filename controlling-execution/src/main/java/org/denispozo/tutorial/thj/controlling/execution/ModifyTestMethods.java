package org.denispozo.tutorial.thj.controlling.execution;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Controlling Execution: Exercise 006

public class ModifyTestMethods {
	
	public static int test(int min, int max, int testval){
		if(testval < min || testval > max){
			return -1;
		} else if(testval == min || testval == max){
			return 0;
		} else {
			return 1;
		}
	}
	
	public static void main (String ... args){
		print("" + test(0,10, 28));
		print("" + test(0,10, 10));
		print("" + test(0,10,5));
	}

}

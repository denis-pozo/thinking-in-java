package es.denis.thinking.chapThree;

import static es.denis.thinking.utils.Print.*;

//Chapter - Controlling Execution: Exercise 007

public class loopToHeavenBreak {
	public static void main(String[] args) {
		for(int i = 0 ; i < 150 ; i++){
			print("" + (i+1));
			if(i == 99){
				break;
			}
		}
	}

}

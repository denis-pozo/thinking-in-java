package org.denispozo.tutorial.thj.controllingexecution;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Controlling Execution: Exercise 007

public class LoopToHeavenBreak {
	public static void main(String[] args) {
		for(int i = 0 ; i < 150 ; i++){
			print("" + (i+1));
			if(i == 99){
				break;
			}
		}
	}

}

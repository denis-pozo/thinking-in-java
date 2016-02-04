package org.denispozo.tutorial.thj.three;

import static org.denispozo.tutorial.thj.util.Print.*;
 
//Chapter - Controlling Execution: Exercise 008

public class SwitchStatement {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++){
			newSwitch(i);
		}
	}
	
	public static void newSwitch(int i){
		switch(i){
		case 0:
			print("This is 0");
			break;
		case 1:
			print("This is 1");
			break;
		case 2:
			print("This is 2");
			break;
		case 3:
			print("This is 3");
			break;
		case 4:
			print("This is 4");
			break;
		default:
			print("Default case");
		}
		
	}

}

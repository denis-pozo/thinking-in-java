package es.denis.thinking.chapThree;

import static es.denis.thinking.utils.Print.*;

//Chapter - Controlling Execution: Exercise 02

public class IfRandomValues {

	public static void main(String[] args) {
		double rand = Math.random();
		double randAux = Math.random();
		for(int i = 0 ; i<25 ; i++){
			if(rand > randAux){
				print(randAux + " less than " + rand);
			}else if(rand < randAux){
				print(randAux + " greater than " + rand);
				
			}else{
				print(randAux + " equal to " + rand);
			}
			randAux = Math.random();	
		}

	}

}

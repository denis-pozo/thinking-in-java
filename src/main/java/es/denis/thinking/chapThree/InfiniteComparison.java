package es.denis.thinking.chapThree;

import static es.denis.thinking.utils.Print.*;

//Chapter - Controlling Execution: Exercise 03

public class InfiniteComparison {

	public static void main(String[] args) {
		double rand = Math.random();
		double randAux = Math.random();
		while(true){
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

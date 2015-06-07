package es.denis.thinking.chapFour.lExerciseTwelve;

import static es.denis.thinking.utils.Print.*;

//Chapter - Initialization & Cleanup
public class Tank {
	
	private boolean empty = true;
	
	public Tank(){
		print("New Tank created");
	}
	
	public void filled(){
		empty = false;
	}
	public void emptied(){
		empty = true;
	}
	
	protected void finalize(){
		if(empty){
			print("Tank finalized");
		} else {
			print("Error, Tank must be empty");
		}
	}
	
	public static void main(String [] args){
		Tank tank = new Tank();
		tank.filled();
		tank.finalize();
		tank.emptied();
		tank.finalize();
		
	}
}

package es.denis.thinking.chapFour;

import static es.denis.thinking.utils.Print.*;

//Chapter - Initialization & Cleanup
public class LTankTuelve {
	
	private boolean empty = true;
	
	public LTankTuelve(){
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
		LTankTuelve tank = new LTankTuelve();
		tank.filled();
		tank.finalize();
		tank.emptied();
		tank.finalize();
		
	}
}

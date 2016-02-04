package org.denispozo.tutorial.thj.four.jExerciseTen;

import static org.denispozo.tutorial.thj.util.Print.*;

//Chapter - Initialization & Cleanup
public class JExerciseTen {
	
	
	public JExerciseTen(){
		print("New Object created");
	}
	
	protected void finalize(){
		print("Object finalized");
	}
	
	public static void main(String [] args){
		JExerciseTen eight = new JExerciseTen();
		eight.finalize();
		
	}
}

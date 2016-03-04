package org.denispozo.tutorial.thj.operators;

//Chapter - Operators: Exercise 3

public class AliasingDuringMethodCalls {
	
	float number;
	
	public AliasingDuringMethodCalls(float f){
		number = f;
	}
	
	public static void setNumber(AliasingDuringMethodCalls object){
		if(object.number == 987)
			object.number = 986;
		else
			object.number = 987;
		
	}
}

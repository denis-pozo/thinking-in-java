package es.denis.thinking.chapTwo;

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

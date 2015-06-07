package es.denis.thinking.chapFour.oExerciseFifteen;

import static es.denis.thinking.utils.Print.*;

public class StringWithInstanceInit {
	
	public static String s;
	
	{
		s = "Static string";
	}
	
	public StringWithInstanceInit(){
		print(s);
	}

	public static void main(String[] args) {
		
		StringWithInstanceInit swii = new StringWithInstanceInit(); 
		swii.toString();
	}
}

package org.denispozo.tutorial.thj.four.oExerciseFifteen;

import static org.denispozo.tutorial.thj.util.Print.*;

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

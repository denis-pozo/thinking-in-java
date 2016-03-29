package org.denispozo.tutorial.thj.interfaces.classprocessor;

import java.util.Arrays;

public class Swapper extends StringProcessor {

	@Override
	public String process(Object input) {
		String s = (String) input;
		char [] swapped = new char[s.length()];
		
		for(int i = 0 ; i < s.length() - 1 ; i += 2){
			swapped[i] = s.charAt(i+1);
			swapped[i+1] = s.charAt(i);
		}
		
		if(s.length() % 2 != 0) {
			swapped[s.length() - 1] = s.charAt(s.length()-1); 
		}
		
		return Arrays.toString(swapped).replaceAll("\\[", "")
									   .replaceAll(", ", "")
									   .replaceAll("\\]", "");
	}
}

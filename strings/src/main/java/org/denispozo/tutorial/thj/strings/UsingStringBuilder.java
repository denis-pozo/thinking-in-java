package org.denispozo.tutorial.thj.strings;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Random;

/*
 * Chapter - Strings
 * Section - Overloading + vs StringBuilder
 * Example
 */

public class UsingStringBuilder {
	public static Random rand = new Random(47);
	
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for(int i = 0 ; i < 25 ; i++){
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length()-2,  result.length());
		result.append("]");
		return result.toString();
	}
	
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		print(usb);
	}
	
}
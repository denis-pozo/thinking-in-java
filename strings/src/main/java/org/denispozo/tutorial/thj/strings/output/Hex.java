package org.denispozo.tutorial.thj.strings.output;

/*
 * Chapter - Strings
 * Section - String.format()
 * Example
 */

public class Hex {

	public static String format(byte [] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		
		for(byte b : data){
			if(n % 16 == 0) {
				result.append(String.format("%05X: ", n));
			}
			result.append(String.format("%02X: ", b));
			n++;
			if(n % 16 == 0) result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}
	
//	TODO wait for I/O chapter
//	public static void main(String[] args) {
//		if(args.length == 0) {
//			System.out.println(format(BinaryFile.read("Hex.class")));
//		} else {
//			System.out.println(format(BinaryFile.read(new File(args[0]))));
//		}
//	}
	
	
}
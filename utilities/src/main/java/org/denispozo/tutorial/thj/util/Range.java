package org.denispozo.tutorial.thj.util;

public class Range {

	/**
	 * Produce a sequence [start .. end) incrementing by step
	 * 
	 * @param start first integer of the sequence
	 * @param end first integer not included in the sequence
	 * @return an array with the sequence
	 */
	public static int[] range(int start, int end, int step) {
		int length = (end - start) / step;
		int[] result = new int[length];
		
		for(int i = 0 ; i < length ; i++) {
			result[i] = start + (i * step);
		}
		
		return result;
	}
	
	/**
	 * Produce a sequence [start .. end)
	 * 
	 * @param start first integer of the sequence
	 * @param end first integer not included in the sequence
	 * @return an array with the sequence
	 */
	public static int[] range(int start, int end) {
		
		return range(start, end, 1);
	}
	
	/**
	 * Produce a sequence [0 .. n)
	 * 
	 * @param n end of the sequence
	 * @return an array with the sequence
	 */
	public static int[] range(int n) {
		
		return range(0, n);
	}
}

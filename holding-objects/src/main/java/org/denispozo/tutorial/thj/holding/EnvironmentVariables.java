package org.denispozo.tutorial.thj.holding;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Map;

/*
 * Chapter - Holding your objects
 * Section - Foreach and Iterators
 * Book Example
 */

public class EnvironmentVariables {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		for(Map.Entry entry : System.getenv().entrySet()) {
			print(entry.getKey() + ": " + entry.getValue());
		}
	}
}

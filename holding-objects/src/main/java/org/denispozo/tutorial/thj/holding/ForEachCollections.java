package org.denispozo.tutorial.thj.holding;

import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/*
 * Chapter - Holding your objects
 * Section - Foreach and Iterators
 * Book Example
 */

public class ForEachCollections {
	
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		for(String s : cs){
			printnr("'" + s + "'");
		}
	
	}
	
}

package org.denispozo.tutorial.thj.generics.set;

import java.util.EnumSet;
import java.util.Set;
import static org.denispozo.tutorial.thj.util.Sets.*;

import org.denispozo.tutorial.thj.generics.Watercolors;
import static org.denispozo.tutorial.thj.generics.Watercolors.*;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Generics
 * Section - A Tuple Library
 * Example
 */

public class WatercolorSets {
	
	public static void main(String[] args) {
		
		Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIDRIAN_HUE);
		Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
		
		print("set1: " + set1);
		print("set2: " + set2);
		print("union(set1, set2): " + union(set1, set2));
		
		Set<Watercolors> subset = intersection(set1, set2);
		print("intersection(set1, set2): " + subset);
		print("difference(set1, subset): " + difference(set1, subset));
		print("difference(set2, subset): " + difference(set2, subset));
		print("complement(set1, set2): " + complement(set1, set2));
		
	}

}

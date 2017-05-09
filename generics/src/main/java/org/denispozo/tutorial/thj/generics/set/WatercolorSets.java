package org.denispozo.tutorial.thj.generics.set;

import static org.denispozo.tutorial.thj.generic.Watercolors.BRILLIANT_RED;
import static org.denispozo.tutorial.thj.generic.Watercolors.BURNT_UMBER;
import static org.denispozo.tutorial.thj.generic.Watercolors.CERULEAN_BLUE_HUE;
import static org.denispozo.tutorial.thj.generic.Watercolors.VIDRIAN_HUE;
import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.Sets.complement;
import static org.denispozo.tutorial.thj.util.Sets.difference;
import static org.denispozo.tutorial.thj.util.Sets.intersection;
import static org.denispozo.tutorial.thj.util.Sets.union;

import java.util.EnumSet;
import java.util.Set;

import org.denispozo.tutorial.thj.generic.Watercolors;

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

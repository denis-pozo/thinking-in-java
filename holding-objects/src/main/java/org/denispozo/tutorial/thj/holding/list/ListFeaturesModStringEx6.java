package org.denispozo.tutorial.thj.holding.list;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Chapter - Holding your Objects
 * Section - Lists
 * Exercise 6
 */

public class ListFeaturesModStringEx6 {
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> strings = new ArrayList<String>();
		print("0: " + strings);
		Collections.addAll(strings, "what", "a", "shitty", "day");
		print("1: " + strings);
		String str = ":(";
		strings.add(str);
		print("2: " + strings);
		print("3: " + strings.contains(str));
		strings.remove(str);
		String p = strings.get(2);
		print("4: " + p + " " + strings.indexOf(p));
		String cymric = "yay";
		print("5: " + strings.indexOf(cymric));
		print("6: " + strings.remove(cymric));
		print("7: " + strings.remove(p));
		print("8: " + strings);
		strings.add(0, "hello");
		print("9: " + strings);
		List<String> sub = strings.subList(1, 4);
		print("SubList: " + sub);
		print("10: " + strings.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + strings.containsAll(sub));
		Collections.shuffle(sub, rand);
		print("shuffled subList: " + sub);
		print("12: " + strings.containsAll(sub));
		List<String> copy = new ArrayList<String>(strings);
		sub = Arrays.asList(strings.get(1), strings.get(3));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<String>(strings);
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub);
		print("15: " + copy);
		copy.set(0, "yes");
		print("16: " + copy);
		copy.addAll(0, sub);
		print("17: " + copy);
		print("18: " + strings.isEmpty());
		strings.clear();
		print("19: " + strings);
		print("20: " + strings.isEmpty());
		strings.addAll(Arrays.asList("Hi","no","forget","it"));
		print("21: " + strings);
		Object [] o = strings.toArray();
		print("22: " + o[3]);
		@SuppressWarnings("unused")
		String[] pa = strings.toArray(new String[0]);
//		print("23: " + pa[3].id());
	}
}

package org.denispozo.tutorial.thj.holding.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Holding your objects
 * Section - Map
 * Exercise 24
 */

public class Ex24{	
	public static void main(String[] args) {
		Map<String,Integer> m = 
			new LinkedHashMap<String,Integer>();
		m.put("ten", 10);
		m.put("nine", 9);
		m.put("eight", 8);
		m.put("seven", 7);
		m.put("six", 6);
		m.put("five", 5);
		m.put("four", 4);
		m.put("three", 3);
		m.put("two", 2);
		m.put("one", 1);
		m.put("zero", 0);
		print("Map to sort: " + m);
		// temporary map to hold entrys:
		Map<String,Integer> mTemp = 
			new LinkedHashMap<String,Integer>();
		// use TreeSet to sort the keySet():
		Set<String> ss = new TreeSet<String>(m.keySet());
		// mover sorted keys to temp map:
		Iterator<String> itss = ss.iterator();
		while(itss.hasNext()) {
			String s = (String)itss.next();
			Integer i = m.get(s);
			m.remove(s);
			mTemp.put(s, i);
		}
		// get sorted list of temp keys:
		Set<String> ssTemp = 
			new TreeSet<String>(mTemp.keySet());
		// move sorted entrys back to map:
		Iterator<String> itssTemp = ssTemp.iterator();
		while(itssTemp.hasNext()) {
			String s = (String)itssTemp.next();
			Integer i = mTemp.get(s);
			mTemp.remove(s);
			m.put(s, i);
		}
		// done with temp:
		mTemp.clear();
		print("Sorted map: " + m);
	}
}	

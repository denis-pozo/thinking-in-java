package org.denispozo.tutorial.thj.holding.objects.map;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.HashMap;
import java.util.Map;

/*
 * Chapter - Holding your Objects
 * Section - Map
 * Exercise 17
 */

public class GerbilHashEx17 {
	
	private static int createdGerbils = 0;
	private int gerbilNumber;
	
	public GerbilHashEx17() {
		gerbilNumber = createdGerbils++;
	}
	
	public void hop() {
		print("Gerbil #" + gerbilNumber + " is hopping!!!");
	}
	
	public static void main(String [] args) {
		Map<String, GerbilHashEx17> gerbils = new HashMap<String, GerbilHashEx17>();
		
		gerbils.put("Fuzzy", new GerbilHashEx17());
		gerbils.put("Fizzy", new GerbilHashEx17());
		gerbils.put("Fazzy", new GerbilHashEx17());
		gerbils.put("Spot", new GerbilHashEx17());
		gerbils.put("Lili", new GerbilHashEx17());
		gerbils.put("Bob", new GerbilHashEx17());
		gerbils.put("Casper", new GerbilHashEx17());
				
		for(String name : gerbils.keySet()){
			print(name);
			gerbils.get(name).hop();
		}
	}
}

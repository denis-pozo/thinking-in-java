package org.denispozo.tutorial.thj.holding.objects.ex17;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.HashMap;
import java.util.Map;

/*
 * Chapter - Holding your Objects
 * Section - Map
 * Exercise 17
 */

public class GerbilHash {
	
	private static int createdGerbils = 0;
	private int gerbilNumber;
	
	public GerbilHash() {
		gerbilNumber = createdGerbils++;
	}
	
	public void hop() {
		print("Gerbil #" + gerbilNumber + " is hopping!!!");
	}
	
	public static void main(String [] args) {
		Map<String, GerbilHash> gerbils = new HashMap<String, GerbilHash>();
		
		gerbils.put("Fuzzy", new GerbilHash());
		gerbils.put("Fizzy", new GerbilHash());
		gerbils.put("Fazzy", new GerbilHash());
		gerbils.put("Spot", new GerbilHash());
		gerbils.put("Lili", new GerbilHash());
		gerbils.put("Bob", new GerbilHash());
		gerbils.put("Casper", new GerbilHash());
				
		for(String name : gerbils.keySet()){
			print(name);
			gerbils.get(name).hop();
		}
	}
}

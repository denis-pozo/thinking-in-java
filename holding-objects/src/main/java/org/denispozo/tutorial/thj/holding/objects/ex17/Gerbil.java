package org.denispozo.tutorial.thj.holding.objects.ex17;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.HashMap;
import java.util.Map;

/*
 * Chapter - Holding your Objects
 * Section - Map
 * Exercise 17
 */

public class Gerbil {
	
	private static int createdGerbils = 0;
	private int gerbilNumber;
	
	public Gerbil() {
		gerbilNumber = createdGerbils++;
	}
	
	public void hop() {
		print("Gerbil #" + gerbilNumber + " is hopping!!!");
	}
	
	public static void main(String [] args) {
		Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
		
		gerbils.put("Fuzzy", new Gerbil());
		gerbils.put("Fizzy", new Gerbil());
		gerbils.put("Fazzy", new Gerbil());
		gerbils.put("Spot", new Gerbil());
		gerbils.put("Lili", new Gerbil());
		gerbils.put("Bob", new Gerbil());
		gerbils.put("Casper", new Gerbil());
				
		for(String name : gerbils.keySet()){
			print(name);
			gerbils.get(name).hop();
		}
	}
}

package org.denispozo.tutorial.thj.holding.iterator;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Chapter - Holding your Objects
 * Section - Iterator
 * Exercise 8
 */

public class GerbilEx8 {
	
	private static int createdGerbils = 0;
	private int gerbilNumber;
	
	public GerbilEx8() {
		gerbilNumber = createdGerbils++;
	}
	
	public void hop() {
		print("Gerbil #" + gerbilNumber + " is hopping!!!");
	}
	
	public static void main(String [] args) {
		List<GerbilEx8> gerbils = new ArrayList<GerbilEx8>();
		
		for(int i = 0 ; i < 10 ; i++){
			gerbils.add(new GerbilEx8());
		}
		
		Iterator<GerbilEx8> it = gerbils.iterator();
		while(it.hasNext()){
			it.next().hop();
		}
	}
}

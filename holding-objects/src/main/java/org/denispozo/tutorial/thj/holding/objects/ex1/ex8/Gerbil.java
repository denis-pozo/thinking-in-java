package org.denispozo.tutorial.thj.holding.objects.ex1.ex8;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Chapter - Holding your Objects
 * Section - Iterator
 * Exercise 8
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
		List<Gerbil> gerbils = new ArrayList<Gerbil>();
		
		for(int i = 0 ; i < 10 ; i++){
			gerbils.add(new Gerbil());
		}
		
		Iterator<Gerbil> it = gerbils.iterator();
		while(it.hasNext()){
			it.next().hop();
		}
	}
}

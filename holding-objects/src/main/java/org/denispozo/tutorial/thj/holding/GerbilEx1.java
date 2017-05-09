package org.denispozo.tutorial.thj.holding;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Holding your Objects
 * Section - Generics and Type-Safe Containers
 * Exercise 1
 */

public class GerbilEx1 {
	
	private static int createdGerbils = 0;
	private int gerbilNumber;
	
	public GerbilEx1() {
		gerbilNumber = createdGerbils++;
	}
	
	public void hop() {
		print("Gerbil #" + gerbilNumber + " is hopping!!!");
	}
	
	public static void main(String [] args) {
		List<GerbilEx1> gerbils = new ArrayList<GerbilEx1>();
		
		for(int i = 0 ; i < 10 ; i++){
			gerbils.add(new GerbilEx1());
		}
		
		for(int i = 0 ; i < 10 ; i++){
			gerbils.get(i).hop();
		}
	}
}

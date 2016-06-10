package org.denispozo.tutorial.thj.holding.objects.ex01;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Holding your Objects
 * Section - Generics and Type-Safe Containers
 * Exercise 1
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
		
		for(int i = 0 ; i < 10 ; i++){
			gerbils.get(i).hop();
		}
	}
}

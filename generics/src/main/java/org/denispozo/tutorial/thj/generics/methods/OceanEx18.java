package org.denispozo.tutorial.thj.generics.methods;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import org.denispozo.tutorial.thj.util.Generator;

/*
 * Chapter - Generics
 * Section - Anonymous Inner Classes
 * Example
 */

public class OceanEx18 {
	
	public static void eat (BigFish b, LittleFish l) {
		print(b + " eats " + l);
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		
		Queue<LittleFish> food = new LinkedList<LittleFish>();
		Generators.fill(food, LittleFish.generator, 15);
		
		List<BigFish> predators = new ArrayList<BigFish>();
		Generators.fill(predators, BigFish.generator(), 4);
		
		for(LittleFish c : food) {
			eat(predators.get(rand.nextInt(predators.size())), c);
		}
	}
}


class BigFish {
	private static long counter = 1;
	private final long id = counter++;
	
	private BigFish() { }
	
	public String toString() { return "BigFish " + id; }
	
	// A method to produce generator objects:
	public static Generator<BigFish> generator() {
		return new Generator<BigFish>() {
			public BigFish next() {
				return new BigFish();
			}
		};
	}	
}

class LittleFish {
	private static long counter = 1;
	private final long id = counter++;
	
	private LittleFish() { }
	
	public String toString() { return "LittleFish " + id; }
	
	// A single Generator object:
	public static Generator<LittleFish> generator = new Generator<LittleFish>(){
		public LittleFish next() {
			return new LittleFish();
		}
	};
}
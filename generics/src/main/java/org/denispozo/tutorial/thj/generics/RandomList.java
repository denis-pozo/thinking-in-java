package org.denispozo.tutorial.thj.generics;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.Random;

/*
 * Chapter - Generics
 * Section - RandomList
 * Example
 */

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	
	public void add(T item){
		storage.add(item);
	}
	
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for(String s : ("The quick brown fox jumped over " +
				"the lazy brown dog").split(" ")){
			rs.add(s);
		}
		
		for(int i = 0 ; i < 15 ; i++) {
			print(rs.select());
		}
	}
}
